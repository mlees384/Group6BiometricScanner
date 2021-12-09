/**
 * 
 */
package com.BiometricScanner.ScannerModel;

/**
 * @author mlees
 *
 * This is the Retina Scanner class that extends from the Scanner abstract class
 */
public class Retina extends Scanner {
	
	public Retina() {
		
	}
	
	public void scanRetina() {
		System.out.println("Scanning Retina");
		return;
	}
	
	public boolean onRetinaDetection() {
		System.out.println("Retina detected");
		return true;
	}

	@Override
	public void beginScan() {
		// TODO Auto-generated method stub
		super.beginScan();
	}

	@Override
	public void stopScan() {
		// TODO Auto-generated method stub
		super.stopScan();
	}

	@Override
	public boolean onPersonnelDetection() {
		// TODO Auto-generated method stub
		return super.onPersonnelDetection();
	}

	@Override
	public boolean onTenSeconds() {
		// TODO Auto-generated method stub
		return super.onTenSeconds();
	}

	@Override
	public boolean onThreeFails() {
		// TODO Auto-generated method stub
		return super.onThreeFails();
	}

	@Override
	public boolean onDoorClosed() {
		// TODO Auto-generated method stub
		return super.onDoorClosed();
	}

	@Override
	public void sendUnlockCommand() {
		// TODO Auto-generated method stub
		super.sendUnlockCommand();
	}

	@Override
	public void sendLockCommand() {
		// TODO Auto-generated method stub
		super.sendLockCommand();
	}

	@Override
	public boolean awaitDetection() {
		// TODO Auto-generated method stub
		return super.awaitDetection();
	}

	@Override
	public void sendCommand() {
		// TODO Auto-generated method stub
		super.sendCommand();
	}

}
