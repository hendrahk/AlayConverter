public class Main {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static String kamus[] = {"1","3","0","5", "4"};

    public static void main(String[] args) {
        System.out.println("== PROGRAM ALAY CONVERTER ==");
        String value = info("Masukkan kata");
        String hasil="";
        String stringToArray[] = value.split("");

        for (int i = 0; i < stringToArray.length; i++) {
            if(stringToArray[i].toLowerCase().equals("i")){
                hasil = hasil + kamus[0];
            }else if(stringToArray[i].toLowerCase().equals("e")){
                hasil = hasil + kamus[1];
            }else if(stringToArray[i].toLowerCase().equals("o")){
                hasil = hasil + kamus[2];
            }else if(stringToArray[i].toLowerCase().equals("s")){
                hasil = hasil + kamus[3];
            }else if(stringToArray[i].toLowerCase().equals("a")){
                hasil = hasil + kamus[4];
            }else{
                hasil=hasil+stringToArray[i];
            }
        }
        System.out.println(hasil);
        }

        static String info(String info){
            System.out.print(info + " :");
            String data = scanner.nextLine();
            return data;
        }
    }
