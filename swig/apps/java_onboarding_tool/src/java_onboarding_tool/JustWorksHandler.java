package java_onboarding_tool;

import org.iotivity.OCObtDeviceStatusHandler;
import org.iotivity.OCUuidUtil;
import org.iotivity.OCUuid;

public class JustWorksHandler implements OCObtDeviceStatusHandler {

    @Override
    public void handler(OCUuid uuid, int status, Object userData) {
        if (status >= 0) {
          System.out.println("\nSuccessfully performed OTM on device " + OCUuidUtil.uuidToString(uuid));
        } else {
          System.out.println("\nERROR performing ownership transfer on device " + OCUuidUtil.uuidToString(uuid));
        }
    }

}