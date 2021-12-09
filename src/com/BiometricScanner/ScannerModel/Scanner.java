/**
 * 
 */
package com.BiometricScanner.ScannerModel;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author mlees
 *
 * The Scanner is an abstract class that generalizes the three types of scanners.
 */

public abstract class Scanner implements SelfCheckCapable {
	
	private String manufacturer;
	private String model;
	private String type;
	
	public void beginScan() {
		System.out.println("Scan started");
		return;
	}
	
	public void stopScan() {
		System.out.println("Scan stopped");
		return;
	}

	
	public boolean onPersonnelDetection() {
		System.out.println("Personnel detected");
		return true;
	}
	
	public boolean onTenSeconds() {
		System.out.println("Ten seconds elapsed");
		return true;
		
	}
	
	public boolean onThreeFails() {
		System.out.println("Three failures have occured");
		return true;
		
	}
	
	public boolean onDoorClosed() {
		System.out.println("Door closed");
		return true;
		
	}
	
	public void sendUnlockCommand() {
		System.out.println("Unlock requested");
		return;
		
	}
	
	public void sendLockCommand() {
		System.out.println("Lock requested");
		return;
		
	}
	
	public boolean awaitDetection() {
		System.out.println("Standing by for personnel detection...");
		return true;
		
	}
	
	public void sendCommand() {
		System.out.println("Command Sent");
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
		return "My Scanners";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}
	
}
