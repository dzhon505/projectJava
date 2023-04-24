import java.util.*;

public class NoteBook{
    private String brand;
    private String color;
    private String os;
    private String processor;
    private int ram;
    private int ssd;


    void setBrand(String brand){
        this.brand = brand;
    }
    void setColor(String color){
        this.color = color;
    }
    void setOs(String os){
        this.os = os;
    }
    void setProcessor(String processor){
        this.processor = processor;
    }
    void setRam(int ram){
        this.ram = ram;
    }
    void setSsd(int ssd){
        this.ssd = ssd;
    }


    public String getBrand(){
        return brand;
    }
    String getColor(){
        return color;
    }
    String getOs(){
        return os;
    }
    String getProcessor(){
        return processor;
    }
    int getRam(){
        return ram;
    }
    int getSsd(){
        return ssd;
    }

    public Set<NoteBook> filter(Set<NoteBook> laptop) {
        Scanner sc = new Scanner(System.in);
        Set<NoteBook> listLaptop = new HashSet<>(laptop);

        System.out.println("Укажите параметр" +
                "\n1. Размер жесткого диска\n2. Размер оперативной памяти\n3. Укажите операционную систему\n4. Укажите цвет");
        String userRequest = sc.nextLine();

        for (int i = 0; i < userRequest.length(); i++) {
            if(1 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите размер жёсткого диска\n");
                String inputHdd = sc.nextLine();
                int intParseInputHdd = Integer.parseInt(inputHdd);
                for (NoteBook tempLaptop : laptop) {
                    if (intParseInputHdd <= tempLaptop.ssd){
                        listLaptop.remove(tempLaptop);
                    }
                }
            }

            if(2 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите количество оперативной памяти\n");
                String inputRam = sc.nextLine();
                int intParseInputRam = Integer.parseInt(inputRam);
                for (NoteBook tempLaptop : laptop) {
                    if (intParseInputRam <= tempLaptop.ram){
                        listLaptop.remove(tempLaptop);
                    }
                }
            }

            if(3 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите операционную систему\nWindows, Mac OS, Linux ");
                String inputOs = sc.nextLine();
                for (NoteBook tempLaptop : laptop) {
                    if ((inputOs.equals(tempLaptop.os) == false)) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }

            if(4 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите цвет ноутбука\nBlack, White, Silver");
                String inputColor = sc.nextLine();
                for (NoteBook tempLaptop : laptop) {
                    if ((inputColor.equals(tempLaptop.color)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
        }
        return listLaptop;
    }

    @Override
    public String toString() {
        return "\nНоутбук = " + brand + ",\nRAM = " + ram + ",\nSSD = "
                + ssd
                + ",\nОперационная система = " + os + ",\nТип процессора = " + processor
                + ",\nЦвет = " + color + "\n";
    }
}