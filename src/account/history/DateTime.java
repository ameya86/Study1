package account.history;

public class DateTime {
    private String datetime;

    public DateTime(String datetime) {
        this.datetime = datetime;
    }

    public HistoryDTO copyValue(HistoryDTO dto) {
        dto.datetime = this.datetime;
        return dto;
    }
}
