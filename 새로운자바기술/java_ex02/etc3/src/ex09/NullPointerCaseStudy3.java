package ex09;

import java.util.Optional;

class Friend {
    String name;
    Optional<Company> cmp;

    public Friend(String n, Optional<Company> c) {
        name = n;
        cmp = c;
    }

    public String getName() {
        return name;
    }

    public Optional<Company> getCmp() {
        return cmp;
    }
}

class Company {
    String cName;
    Optional<ContInfo> cInfo;

    public Company(String cn, Optional<ContInfo> ci) {
        cName = cn;
        cInfo = ci;
    }

    public String getcName() {
        return cName;
    }

    public Optional<ContInfo> getcInfo() {
        return cInfo;
    }
}

class ContInfo {
    Optional<String> phone;
    Optional<String> adrs;

    public ContInfo(Optional<String> ph, Optional<String> ad) {
        phone = ph;
        adrs = ad;
    }

    public Optional<String> getPhone() {
        return phone;
    }

    public Optional<String> getAdrs() {
        return adrs;
    }
}

public class NullPointerCaseStudy3 {
    public static void showCompAddr(Optional<Friend> f) {
        String addr = f.flatMap(Friend::getCmp)
                .flatMap(Company::getcInfo)
                .flatMap(ContInfo::getAdrs)
                .orElse("There's no address information.");

        System.out.println(addr);
    }

    public static void main(String[] args) {
        Optional<ContInfo> ci = Optional.of(
                new ContInfo(Optional.ofNullable(null), Optional.of("Republic of Korea"))
        );
        Optional<Company> cp = Optional.of(new Company("YaHo Co., Ltd.", ci));
        Optional<Friend> frn = Optional.of(new Friend("LEE SU", cp));
        showCompAddr(frn);
    }
}
