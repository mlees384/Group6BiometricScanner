/**
 * 
 */
package com.BiometricScanner.ScannerModel;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author mlees
 *
 */
public class Display implements SelfCheckCapable {
	
	public Display() {
		
	}
	
	private String xDimension;
	private String yDimension;
	private String resolution;
	
	public void displayOn() {
		System.out.println("Turning on display");
		return;
	}
	
	public void displayOff() {
		System.out.println("Turning off display");
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
		return "My Display";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}
	
}
