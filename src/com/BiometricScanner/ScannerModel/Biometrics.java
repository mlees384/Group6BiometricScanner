/**
 * 
 */
package com.BiometricScanner.ScannerModel;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author mlees
 * 
 * The Biometrics class represents the database that houses the personnels biometric data.
 */
public class Biometrics implements SelfCheckCapable {
	
	private byte fingerprintKey;
	private byte voiceKey;
	private byte retinaKey;
	
	public void authenticateKey() {
		System.out.println("Key Authenticated");
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
		return "My Biometrics";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
