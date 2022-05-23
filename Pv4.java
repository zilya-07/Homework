//int32 to IPv4
public class Kata {
    public static String longToIP(long ip) {
        StringBuilder sb = new StringBuilder(Long.toBinaryString(ip));
        while (sb.length() < 32) {
            sb.insert(0, 0);
        }
        return Stream.of(sb.toString()
                        .split("(?=(.{8})+$)"))
                .map(x -> Integer.toString(Integer.parseInt(x, 2)))
                .collect(Collectors.joining("."));
    }
}
