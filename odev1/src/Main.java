public class Main
{
    public static void main(String[] args)
    {
        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        System.out.println(sayi1);
        System.out.println("-----------------------------------");

        int[] sayilar1 = {1,2,3};
        int[] sayilar2 = {10,20,30};
        sayilar1 = sayilar2;
        sayilar2[0] = 1000;
        System.out.println(sayilar1[0]);
        System.out.println("-----------------------------------");

        CreditManager creditManager = new CreditManager();
        creditManager.hesapla();
        //------------------------------------------------------------
        Person person = new Person();
        // Sadece olayı tamamen çözdüğüm için detaylı uğraşıp vakit kaybetmiyorum.
        // Miras olayını öğrendim. Bu videodaki her şey anlaşıldı.
        Customer customer = new Customer();
        customer.id = "3265275476";
        customer.firstName = "Batuhan";
        customer.lastName = "CAN";
        customer.phoneNumber = "982368475234";
        customer.city = "Ankara";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save();
        customerManager.save();
        customerManager.delete();
        customerManager.delete();

        //------------------------------------------------------------

        Company company = new Company();
    }
}