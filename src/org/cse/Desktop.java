package org.cse;

public class Desktop extends Computer{

	public void desktopsize() {
		System.out.println("30inch");
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.desktopsize();
		d.computerModel();
	}
}
