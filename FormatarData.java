import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatarData {
    public static String converter(String dateString) {
        String[] patterns = {"dd/MM/yyyy", "dd MM yyyy", "ddMMyyyy", "yyyy MM dd"};

        for (String pattern : patterns) {
            try {
                DateTimeFormatter formatarEntrada = DateTimeFormatter.ofPattern(pattern);
                LocalDate data = LocalDate.parse(dateString, formatarEntrada);
                DateTimeFormatter formatarSaida = DateTimeFormatter.ofPattern("yyyy MM");
                return data.format(formatarSaida);
            } catch (Exception e) {
            }
        }

        return "Formato inválido";
    }

    public static void main(String[] args) {
        String[] dates = {"01/05/2018", "01 05 2018", "01052018", "2018 05 01"};

        for (String date : dates) {
            String converterData = converter(date);
            System.out.println(converterData);
        }
    }
}

