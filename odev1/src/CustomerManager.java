public class CustomerManager
{
    private Customer _customer;
    public CustomerManager(Customer customer)
    {
        _customer = customer;
    }
    public void save()
    {
        System.out.println("Müşteri kaydedildi\n" + _customer.id + " " + _customer.firstName + " " + _customer.lastName + " "
        + _customer.phoneNumber + " " + _customer.city);
        System.out.println("-----------------------------------");
    }

    public void delete()
    {
        System.out.println("Müşteri silindi\n" + _customer.id);
        System.out.println("-----------------------------------");
    }
}
