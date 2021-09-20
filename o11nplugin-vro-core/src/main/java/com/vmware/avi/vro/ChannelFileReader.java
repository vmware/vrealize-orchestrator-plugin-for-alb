package com.vmware.avi.vro;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelFileReader {
	private FileInputStream fileIn;
	private ByteBuffer byteBuf;
	private long fileLength;
	private int arraySize;
	private byte[] array;

	public ChannelFileReader(String fileName, int arraySize) throws IOException {
		this.fileIn = new FileInputStream(fileName);
		this.fileLength = fileIn.getChannel().size();
		this.arraySize = arraySize;
		this.byteBuf = ByteBuffer.allocate(arraySize);
	}

	public int read() throws IOException {
		FileChannel fileChannel = fileIn.getChannel();
		int bytes = fileChannel.read(byteBuf);// read into ByteBuffer
		if (bytes != -1) {
			array = new byte[bytes];// The length of the byte array is the read length
			byteBuf.flip();
			byteBuf.get(array);// Get byte array from ByteBuffer
			byteBuf.clear();
			return bytes;
		}
		return -1;
	}

	public void close() throws IOException {

		fileIn.close();
		array = null;
	}

	public byte[] getArray() {
		return array;
	}

	public long getFileLength() {
		return fileLength;
	}

	/*
	 * public static void main(String[] args) throws IOException { ChannelFileReader
	 * reader = new ChannelFileReader("/home/zfh/movie.mkv", 65536); long start =
	 * System.nanoTime(); while (reader.read() != -1) ; long end =
	 * System.nanoTime(); reader.close(); System.out.println("ChannelFileReader: " +
	 * (end - start)); }
	 */
}
