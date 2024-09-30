import java.time.LocalDateTime;

public class zurnalaEntry {
}

class ZurnalaEntry {
    private String teksts;
    private LocalDateTime datums;

    public ZurnalaEntry(String teksts) {
        this.teksts = teksts;
        this.datums = LocalDateTime.now();
    }
}
