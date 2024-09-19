package e08;

public class Customer implements Comparable {
    private Integer customerId;
    private String name, address, website;
    private double creditLimit;

    public Customer(Integer customerId, String name, String address, String website, Double creditLimit) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.website = website;
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", name=" + name + ", address=" + address + ", website="
                + website + ", creditLimit=" + creditLimit + "]";
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getWebsite() {
        return website;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        if (customerId == null) {
            if (other.customerId != null)
                return false;
        } else if (!customerId.equals(other.customerId))
            return false;
        return true;
    }

    @Override
    public int compareTo(Object o) {
        Customer c = (Customer) o;
        return getCustomerId() - c.getCustomerId();
    }

}
