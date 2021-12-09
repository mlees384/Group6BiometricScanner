/**
 * 
 */
package com.BiometricScanner.ScannerModel;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author mlees
 * 
 * The Speaker will receive notification from the scanners and play the appropriate indication jingle.
 */
public class Speaker implements SelfCheckCapable {
	
	public Speaker() {
		
	}
	
	private String manufacturer;
	private String model;
	private int volume;
	
	public void playJingle1() {
		System.out.println("Playing Jingle 1");
		return;
	}
	
	public void playJingle2() {
		System.out.println("Playing Jingle 2");
		return;
	}
	
	public void playJingle3() {
		System.out.println("Playing Jingle 3");
		return;
	}
	
	public void playJingle4() {
		System.out.println("Playing Jingle 4");
		return;
	}
	
	public void playJingle5() {
		System.out.println("Playing Jingle 5");
		return;
	}
	
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My Speaker";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}
	
}
