public class AccessorGetterSetterMethod {
    public static void main(String args[]) {
        Car car1 = new Car("Toyota", "RAV4", 2015);
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

        car1.setMake("Honda");
        car1.setModel("CRV");
        car1.setYear(2022);

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
    }
}
