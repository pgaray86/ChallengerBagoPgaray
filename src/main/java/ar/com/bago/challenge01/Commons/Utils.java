package ar.com.bago.challenge01.Commons;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Utils {
    public final static String ARGENTINA_ZONED_DATETIME = "America/Argentina/Buenos_Aires";
    public final static DateTimeFormatter DATE = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public final static DateTimeFormatter DATEMONTHYEAR = DateTimeFormatter.ofPattern("MM/yyyy");
    public final static DateTimeFormatter LOCALDATE = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public final static DateTimeFormatter DATETIME_H_M = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    public final static DateTimeFormatter HORA_MINUTOS = DateTimeFormatter.ofPattern("HH:mm");
    public final static DateTimeFormatter DATETIME_H_M_S = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public final static DateTimeFormatter LOCALDATE_H_M_S = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public final static DateTimeFormatter DATE_MONTH = DateTimeFormatter.ofPattern("MM");
    public final static DateTimeFormatter DATE_YEAR = DateTimeFormatter.ofPattern("yyyy");
    public final static DateTimeFormatter DATE_DAY = DateTimeFormatter.ofPattern("dd");
    public final static DateTimeFormatter DATE_ANIOMES = DateTimeFormatter.ofPattern("yyyyMM");
    public final static DateTimeFormatter ANIOMES_DATE = new DateTimeFormatterBuilder()
            .appendPattern("yyyyMM")
            .parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
            .toFormatter();
    public static LocalDateTime LocalDateTimeNow() {
        return ZonedDateTime.now(ZoneId.of(ARGENTINA_ZONED_DATETIME)).toLocalDateTime();
    }

}
