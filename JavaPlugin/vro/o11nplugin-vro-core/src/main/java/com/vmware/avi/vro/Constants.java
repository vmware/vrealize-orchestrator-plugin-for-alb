package com.vmware.avi.vro;
public class Constants {
	public static final String FINDER_VRO_PLUGIN = "Vro";
    public static final String FINDER_AVI_VRO_CLIENT = "AviVroClient";
    public static final String FINDER_VRO_SNAPIN_ROOT = "VROSnapInRoot";
    public static final String FINDER_VRO_SNAPIN = "VROSnapIn";
    public static final String FINDER_VRO_CMDLET = "VROCmdlet";
    public static final String FINDER_VRO_SESSION = "VROSession";
    public static final String FINDER_VRO_REMOTE_PS_OBJECT = "VRORemotePSObject";
	public static final String RELATION_AVI_VRO_CLIENT = "AviVroClient";	
    public static final String RELATION_VRO_SESSIONS = "VROSessions";
    public static final String RELATION_HOST_HAS_SNAPIN_ROOT = "HostHasSnapinRoot";
    public static final String RELATION_SNAPINROOT_HAS_SNAPIN = "SnapinRootHasSnapin";
    public static final String RELATION_SNAPIN_HAS_CMDLET= "SnapinHasCmdlet";
    public static final String PLUGIN_NAME = "Avi";
    public static final String TYPE_POWERSHELL_HOST = String.format("%s:%s", Constants.PLUGIN_NAME, Constants.FINDER_AVI_VRO_CLIENT);
    public static final String TYPE_VRO_REMOTE_PS_OBJECT = String.format("%s:%s", Constants.PLUGIN_NAME, Constants.FINDER_VRO_REMOTE_PS_OBJECT);
}