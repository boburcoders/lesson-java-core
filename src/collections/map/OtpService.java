package collections.map;

import java.util.Hashtable;
import java.util.Map;

public class OtpService {
    public static Map<String, Integer> otpStore = new Hashtable<>();

    public boolean sendOtp(String phone) {
//   redis key value, 2 block
        String key = "otp:" + phone;
        int count = otpStore.getOrDefault(key, 0);
        if (count >= 3) {
            return false;
        }

        otpStore.put(key, count + 1);

        return true;
    }
}
