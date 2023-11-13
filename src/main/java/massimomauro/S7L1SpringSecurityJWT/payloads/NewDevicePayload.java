package massimomauro.S7L1SpringSecurityJWT.payloads;

import lombok.Getter;
import massimomauro.S7L1SpringSecurityJWT.enums.DeviceStatus;


@Getter
public class NewDevicePayload {
    private int userId;
    private DeviceStatus deviceStatus;
}
