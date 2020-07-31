package com.tlg.myedit;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
	public static void main(String[] args) {
		FileWindow fwFileWindow = new FileWindow();
		fwFileWindow.pack(); // 调整窗口的大小，使其适应组件的大小和布局
		fwFileWindow.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		fwFileWindow.setBounds(200, 180, 550, 360);
		fwFileWindow.setVisible(true);
	}
}
