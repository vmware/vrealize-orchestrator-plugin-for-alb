package com.vmware.avi.vro;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Properties;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.vmware.avi.vro.configuration.ConfigurationService;
import com.vmware.avi.vro.model.AviConnectionInfo;
import com.vmware.o11n.plugin.sdk.spring.platform.GlobalPluginNotificationHandler;

public class AviVroPluginMockTest {

    private static final String CONTROLLER = System.getenv("AVI_CONTROLLER");
    private static final String USERNAME = System.getenv("AVI_USERNAME");
    private static final String PASSWORD = System.getenv("AVI_PASSWORD");
    private static final String VERSION = System.getenv("AVI_VERSION");
    private static final String TENANT = System.getenv("AVI_TENANT");

    @Mock
    private ConfigurationService configurationService;

    @Mock
    private GlobalPluginNotificationHandler notificationHandler;

    private VroPlugin vroPlugin;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        Properties prop = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("application.properties")) {
            prop.load(input);
        }
        String minVersion = prop.getProperty("vRO.min_version");
        String maxVersion = prop.getProperty("vRO.max_version");
        vroPlugin = new VroPlugin(minVersion, maxVersion);
        Field configField = VroPlugin.class.getDeclaredField("configurationService");
        configField.setAccessible(true);
        configField.set(vroPlugin, configurationService);
        Field notificationField = VroPlugin.class.getDeclaredField("notificationHandler");
        notificationField.setAccessible(true);
        notificationField.set(vroPlugin, notificationHandler);
    }

    @Test
    public void testAddVroClient_Success() throws Exception {
        String token = null;
        String expectedId = CONTROLLER + "-" + TENANT;
        when(configurationService.findById(expectedId)).thenReturn(null);
        AviConnectionInfo savedInfo = new AviConnectionInfo();
        savedInfo.setController(CONTROLLER);
        when(configurationService.save(any(AviConnectionInfo.class))).thenReturn(savedInfo);

        String result = vroPlugin.addVroClient(CONTROLLER, USERNAME, PASSWORD, TENANT, VERSION, token);

        assertEquals(CONTROLLER, result);
        verify(configurationService).findById(expectedId);
        verify(configurationService).save(any(AviConnectionInfo.class));
        verify(notificationHandler).notifyElementsInvalidate();
    }

    @Test(expected = Exception.class)
    public void testAddVroClient_AlreadyExists() throws Exception {
        String token = null;
        String expectedId = CONTROLLER + "-" + TENANT;
        AviConnectionInfo existingInfo = new AviConnectionInfo();
        when(configurationService.findById(expectedId)).thenReturn(existingInfo);

        vroPlugin.addVroClient(CONTROLLER, USERNAME, PASSWORD, TENANT, VERSION, token);
    }

    @Test
    public void testRemoveVroClient_Success() throws Exception {
        String controllerId = CONTROLLER + "-" + TENANT;
        AviConnectionInfo existingInfo = new AviConnectionInfo();
        existingInfo.setId(controllerId);
        when(configurationService.findById(controllerId)).thenReturn(existingInfo);

        vroPlugin.removeVroClient(controllerId);

        verify(configurationService).findById(controllerId);
        verify(configurationService).delete(existingInfo);
    }

    @Test(expected = Exception.class)
    public void testRemoveVroClient_Exception() throws Exception {
        String controllerId = CONTROLLER + "-" + TENANT;
        when(configurationService.findById(controllerId)).thenThrow(new RuntimeException("Simulated error"));

        vroPlugin.removeVroClient(controllerId);
    }
}
