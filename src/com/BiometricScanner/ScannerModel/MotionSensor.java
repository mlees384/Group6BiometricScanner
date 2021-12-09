/**
 * 
 */
package com.BiometricScanner.ScannerModel;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author mlees
 *
 * The Motion Sensor will detect personnel and send the signal to the scanners to standby
 * for the respective biometric key.
 */
public class MotionSensor implements SelfCheckCapable {
	
	public MotionSensor() {
		
	}
	
	public void detectPersonnel() {
		System.out.println("Personnel detected");
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
		return "My Motion Sensor";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
