package ex07;

import java.util.Optional;

class ContInfo3 {
    String phone;
    String adrs;

    public ContInfo3(String ph, String ad) {
        phone = ph;
        adrs = ad;
    }

    public String getPhone() {
        return phone;
    }

    public String getAdrs() {
        return adrs;
    }
}

public class MapElseOptional1 {
    public static void main(String[] args) {
        Optional<ContInfo3> ci = Optional.of(new ContInfo3(null, "Republic of Korea"));

        String phone = ci.map(c -> c.getPhone())
                .orElse("There is no phone number.");
        String addr = ci.map(c -> c.getAdrs())
                .orElse("There is no address.");

        System.out.println(phone);
        System.out.println(addr);
    }
}
