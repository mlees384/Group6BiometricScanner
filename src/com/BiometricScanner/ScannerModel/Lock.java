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
public class Lock implements SelfCheckCapable {
	
	public Lock() {
		
	}
	
	private String manufacturer;
	private String model;
	private String type;
	
	public void unlockDoor() {
		System.out.println("Door unlocked");
		return;
	}
	
	public void lockDoor() {
		System.out.println("Door locked");
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
		return "My Lock";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
