import java.util.Scanner;
import java.util.List;
public class Software{
    //Create an inner interface named Hardware
    interface Hardware{
        //There is a "Properties" method in this interface, where each hardware name is defined.
        public String Properties(String name);
    }
    /**
     * Creating the Enum Classes.
     **/
    enum Motherboard{
        Asus("Asus"),
        MSI("MSI"),
        Gigabyte("Gigabyte"),
        Intel("Intel");
        private String name;
        Motherboard(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }
    //Create the ENum CPU.
    enum CPU{
        IntelI7("Intel i7"),
        IntelI5("Intel i5"),
        AMDRyzen9("AMD Ryzen 9"),
        AMDRyzen7("AMD Ryzen 7");
        public String CPU;
        CPU(String CPU){
            this.CPU = CPU;
        }
        public String getCPU(){
            return CPU;
        }
    }
    //Create Memory enum
    enum Memory{
        DDR4("DDR4"),
        DDR3("DDR3"),
        DDR2("DDR2"),
        DDR1("DDR1");
        private String name;
        Memory(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }
    //Create Graphic Card enum
    enum GraphicCard{
        Nvidia("Nvidia"),
        AMD("AMD"),
        Intel("Intel");
        private String name;
        GraphicCard(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }
    //Create Wifi enum
    enum Wifi{
        Intel("Intel"),
        Realtek("Realtek"),
        Broadcom("Broadcom");
        private String name;
        Wifi(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }
    //Create Network interface card enum
    enum NetworkCard{
        Intel("Intel"),
        Realtek("Realtek"),
        Broadcom("Broadcom");
        private String name;
        NetworkCard(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }
    //Create HDD enum
    enum HDD{
        Samsung("Samsung"),
        Seagate("Seagate"),
        WesternDigital("Western Digital"),
        Toshiba("Toshiba");
        private String name;
        HDD(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }
    //Create a SSD Enum
    enum SSD{
        Samsung("Samsung"),
        Seagate("Seagate"),
        WesternDigital("Western Digital"),
        Toshiba("Toshiba");
        private String name;
        SSD(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }
    //Create Power Supply Unit enum.
    enum PowerSupplyUnit{
        Corsair("Corsair"),
        CoolerMaster("Cooler Master"),
        XPower("X-Power");
        private String name;
        PowerSupplyUnit(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }
    //Create Keyboard and mouse enum
    enum KeyboardAndMouse{
        Logitech("Logitech"),
        Razer("Razer");
        private String name;
        KeyboardAndMouse(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }
    //Create Monitor enum
    enum Monitor{
        Acer("Acer"),
        Asus("Asus"),
        Dell("Dell"),
        HP("HP"),
        Samsung("Samsung"),
        ViewSonic("ViewSonic");
        private String name;
        Monitor(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }
    
    /**
     * Defining the Variables.
     */
    public String choice;
    public String brand;
    public String motherboard;
    public String cpu;
    public String memory;
    public String graphic_card;
    public String wifi;
    public String network_interface_card;
    public String hdd;
    public String ssd;
    public String power_supply_unit;
    public String keyboard_and_mouse;
    public String monitor;
    public Hardware hd;
    public String allText;
    
    //Create a lıst so we can prınt all the hardware later on usıng a loop after exiting the program.
    public List<String> SoftwareList = new java.util.ArrayList<String>();

    //This menu will be displayed in a loop such as "do-while" and ask the user to add hardware continuously until 0 is entered.
    public void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("            Welcome!            ");
        System.out.println("********************************");
        do{
            System.out.println("");
            System.out.println("Which part do you want to add?");
            System.out.println("m - Motherboard");
            System.out.println("c - CPU");
            System.out.println("r - Memory");
            System.out.println("g - Graphic Card");
            System.out.println("w - Wifi");
            System.out.println("n - Network Interface Card");
            System.out.println("h - HDD");
            System.out.println("s - SSD");
            System.out.println("p - Power Supply Unit");
            System.out.println("k - Keyboard and Mouse");
            System.out.println("e - Monitor");
            System.out.println("");
            choice = sc.nextLine();
            System.out.println("--------------------------------");
            System.out.println("");
            switch(choice) {
                //We Use Lambda expressions V1 to call the methods of the inner interface Hardware.
                case "m":
                Hardware hd = (String name) -> {
                    return "Type> Motherboard" + "\n        Brand >> " + name;
                };
                System.out.println("Which brand of motherboard do you want to add?");
                System.out.println("Asus");
                System.out.println("MSI");
                System.out.println("Gigabyte");
                System.out.println("Intel");
                System.out.println("");
                brand = sc.nextLine();
                motherboard = hd.Properties(brand);
                System.out.println("");
                System.out.println(hd.Properties(brand));
                SoftwareList.add(hd.Properties(brand));
                System.out.println("");
                System.out.println("--------------------------------");
                break;
            
                case "c":
                Hardware hdCPU = new Hardware(){
                    //Anonymous class kullanılarak Hardware interface içerisindeki Properties methodunu çağırıyoruz.
                    public String Properties(String name){
                        return "Type> CPU" + "\n        Brand >> " + name;
                    }};
                    System.out.println("Which brand of CPU do you want to add?");
                    System.out.println("Intel i7");
                    System.out.println("Intel i5");
                    System.out.println("AMD Ryzen 9");
                    System.out.println("AMD Ryzen 7");
                    System.out.println("");
                    //remove the white spaces from the input.
                    brand = sc.nextLine().trim();
                    cpu = CPU.valueOf(brand).getCPU();
                    hdCPU.Properties(cpu);
                    System.out.println("");
                    System.out.println(hdCPU.Properties(cpu));
                    SoftwareList.add(hdCPU.Properties(cpu));
                    System.out.println("--------------------------------");
                    System.out.println("");
                    break;
                case "r":
                    //Use Lambda v2 to call the methods of the inner interface Hardware.
                    Hardware hdMemory = name ->  "Type> Memory" + "\n        Brand >> " + name;
                    System.out.println("Which brand of Memory do you want to add?");
                    System.out.println("DDR4");
                    System.out.println("DDR3");
                    System.out.println("DDR2");
                    System.out.println("DDR1");
                    System.out.println("");
                    brand = sc.nextLine().toUpperCase().replaceAll("\\s+","");
                    System.out.println("");
                    System.out.println(hdMemory.Properties(brand));
                    SoftwareList.add(hdMemory.Properties(brand));
                    memory = Memory.valueOf(brand).getName();
                    hdMemory.Properties(memory);
                    System.out.println("--------------------------------");
                    break;
                case "g":
                    //We use Lambda expression V2 to call "Properties" method.
                    Hardware hdGraphicCard = name -> "Type> Graphic Card" + "\n        Brand >> " + name;

                    System.out.println("Which brand of Graphic Card do you want to add?");
                    System.out.println("Nvidia");
                    System.out.println("AMD");
                    System.out.println("Intel");
                    System.out.println("");
                    brand = sc.nextLine();
                    System.out.println("");
                    graphic_card = GraphicCard.valueOf(brand).getName();
                    hdGraphicCard.Properties(graphic_card);
                    SoftwareList.add(hdGraphicCard.Properties(graphic_card));
                    System.out.println(hdGraphicCard.Properties(graphic_card));
                    System.out.println("--------------------------------");
                    break;
                
                case "w":
                    //We use Lambda V1 expression to call "Properties" method.
                    Hardware hdWifi = (String name) -> {
                        return "Type> Wifi" + "\n        Brand >> " + name;
                    };
                    System.out.println("Which brand of Wifi do you want to add?");
                    System.out.println("Realtek");
                    System.out.println("Broadcom");
                    System.out.println("Intel");
                    System.out.println("");
                    brand = sc.nextLine();
                    System.out.println("");
                    wifi = Wifi.valueOf(brand).getName();
                    hdWifi.Properties(wifi);
                    SoftwareList.add(hdWifi.Properties(wifi));
                    System.out.println(hdWifi.Properties(wifi));
                    System.out.println("--------------------------------");
                    break;
                case "n":
                    //We use Lambda V2 expression to call "Properties" method.
                    Hardware hdNetworkInterfaceCard = name -> "Type> Network Interface Card" + "\n        Brand >> " + name;

                    System.out.println("Which brand of Network Interface Card do you want to add?");
                    System.out.println("Realtek");
                    System.out.println("Broadcom");
                    System.out.println("Intel");
                    System.out.println("");
                    brand = sc.nextLine();
                    System.out.println("");
                    network_interface_card = NetworkCard.valueOf(brand).getName();
                    hdNetworkInterfaceCard.Properties(network_interface_card);
                    SoftwareList.add(hdNetworkInterfaceCard.Properties(network_interface_card));
                    System.out.println(hdNetworkInterfaceCard.Properties(network_interface_card));
                    System.out.println("--------------------------------");
                    break;
                case "h":
                    //we use Anonymous class to call "Properties" method.
                    Hardware hdHDD = new Hardware(){
                        public String Properties(String name){
                            return "Type> HDD" + "\n        Brand >> " + name;
                        }};
                    System.out.println("Which brand of HDD do you want to add?");
                    System.out.println("Seagate");
                    System.out.println("Western Digital");
                    System.out.println("Toshiba");
                    System.out.println("");
                    brand = sc.nextLine().replaceAll("\\s+","");
                    System.out.println("");
                    hdd = HDD.valueOf(brand).getName();
                    hdHDD.Properties(hdd);
                    SoftwareList.add(hdHDD.Properties(hdd));
                    System.out.println(hdHDD.Properties(hdd));
                    System.out.println("--------------------------------");
                    break;
                case "s":
                    //Use Lambda V1 expression to call "Properties" method.
                    Hardware hdSSD = (String name) -> {
                        return "Type> SSD" + "\n        Brand >> " + name;
                    };
                    System.out.println("Which brand of SSD do you want to add?");
                    System.out.println("Seagate");
                    System.out.println("Western Digital");
                    System.out.println("Toshiba");
                    System.out.println("");
                    brand = sc.nextLine().replaceAll("\\s+","");
                    System.out.println("");
                    ssd = SSD.valueOf(brand).getName();
                    hdSSD.Properties(ssd);
                    SoftwareList.add(hdSSD.Properties(ssd));
                    System.out.println(hdSSD.Properties(ssd));
                    System.out.println("--------------------------------");
                    break;
                case "p":
                    //Use Anonymous class to call "Properties" method.
                    Hardware hdPowerSupply = new Hardware(){
                        public String Properties(String name){
                            return "Type> Power Supply" + "\n        Brand >> " + name;
                        }};
                    System.out.println("Which brand of Power Supply Unit do you want to add?");
                    System.out.println("Corsair");
                    System.out.println("Cooler Master");
                    System.out.println("X-Power");
                    System.out.println("");
                    brand = sc.nextLine().replaceAll("-","");
                    System.out.println("");
                    power_supply_unit = PowerSupplyUnit.valueOf(brand).getName();
                    hdPowerSupply.Properties(power_supply_unit);
                    SoftwareList.add(hdPowerSupply.Properties(power_supply_unit));
                    System.out.println(hdPowerSupply.Properties(power_supply_unit));
                    System.out.println("--------------------------------");
                    break;
                case "k":
                    //Use Anonymous class to call "Properties" method.
                    Hardware hdKeyboard = new Hardware(){
                        public String Properties(String name){
                            return "Type> Keyboard" + "\n        Brand >> " + name;
                        }};
                    System.out.println("Which brand of Keyboard and Mouse do you want to add?");
                    System.out.println("Logitech");
                    System.out.println("Razer");
                    System.out.println("");
                    brand = sc.nextLine();
                    keyboard_and_mouse = KeyboardAndMouse.valueOf(brand).getName();
                    hdKeyboard.Properties(keyboard_and_mouse);
                    SoftwareList.add(hdKeyboard.Properties(keyboard_and_mouse));
                    System.out.println(hdKeyboard.Properties(keyboard_and_mouse));
                    System.out.println("--------------------------------");
                    break;
                case "e":
                    //Use Lambda V1 expression to call "Properties" method.
                    Hardware hdMonitor = (String name) -> {
                        return "Type> Monitor" + "\n        Brand >> " + name;
                    };
                    System.out.println("Which brand of Monitor do you want to add?");
                    //Retrieve the types from the Monitor enum.
                    System.out.println("Acer");
                    System.out.println("Asus");
                    System.out.println("Dell");
                    System.out.println("HP");
                    System.out.println("Samsung");
                    System.out.println("ViewSonic");
                    brand = sc.nextLine();
                    System.out.println("");
                    monitor = Monitor.valueOf(brand).getName();
                    hdMonitor.Properties(monitor);
                    SoftwareList.add(hdMonitor.Properties(monitor));
                    System.out.println("--------------------------------");
                    break;
                case "0":
                    //Print the SoftwareList.
                    for(String s : SoftwareList){
                        System.out.println(s);
                    }
                    System.out.println("****************QUITTING!****************");
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }while(!choice.equals("0"));
    }
    public static void main(String[] args) {
        Software s = new Software();
        s.menu();        
    }
}