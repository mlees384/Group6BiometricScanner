/**
 * 
 */
package com.BiometricScanner.ScannerModel;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author mlees
 * 
 * The Authenticator main class will take the biometric keys from the scanners and 
 * check them against the biometric class.
 */
public class Authenticator implements SelfCheckCapable {
	
	private Biometrics myBiometrics;
	private Civilian Civilian1234;
	private Contractor Contractor1234;
	private Display myDisplay;
	private Fingerprint myFingerprintScanner;
	private Lock myLock;
	private Military Military1234;
	private MotionSensor myMotionSensor;
	private Personnel myPersonnel;
	private Retina myRetinaScanner;
	private Speaker mySpeaker;
	private VoiceRecognition myVoiceRecognitionScanner;
	
	public Authenticator() {
		myBiometrics = new Biometrics();
		Civilian1234 = new Civilian();
		Contractor1234 = new Contractor();
		myDisplay = new Display();
		myFingerprintScanner = new Fingerprint();
		myLock = new Lock();
		Military1234 = new Military();
		myMotionSensor = new MotionSensor();
		myRetinaScanner = new Retina();
		mySpeaker = new Speaker();
		myVoiceRecognitionScanner = new VoiceRecognition();
		
	}
	
	public boolean onVerifyKey() {
		System.out.println("Key Verified");
		return true;
		
	}
	
	public void lockUser() {
		System.out.println("User locked");
		return;
		
	}
	
	public boolean onKeysAuthenticated() {
		System.out.println("Keys Authenticated");
		return true;
		
	}
	
	public void verifyUser() {
		System.out.println("Verifying user");
		return;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Authenticator myAuthenticationScannerSystem = new Authenticator();
		Biometrics myBiometrics = new Biometrics();
		Civilian Civilian1234 = new Civilian();
		Contractor Contractor1234 = new Contractor();
		Display myDisplay = new Display();
		Fingerprint myFingerprintScanner = new Fingerprint();
		Lock myLock = new Lock();
		Military Military1234 = new Military();
		MotionSensor myMotionSensor = new MotionSensor();
		Retina myRetinaScanner = new Retina();
		Speaker mySpeaker = new Speaker();
		VoiceRecognition myVoiceRecognitionScanner = new VoiceRecognition();
		myAuthenticationScannerSystem.runSelfCheck();
		myBiometrics.runSelfCheck();
		Civilian1234.runSelfCheck();
		Contractor1234.runSelfCheck();
		myDisplay.runSelfCheck();
		myFingerprintScanner.runSelfCheck();
		myLock.runSelfCheck();
		Military1234.runSelfCheck();
		myMotionSensor.runSelfCheck();
		myRetinaScanner.runSelfCheck();
		mySpeaker.runSelfCheck();
		myVoiceRecognitionScanner.runSelfCheck();
		
	}
	
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My Authentication Scanner System";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
