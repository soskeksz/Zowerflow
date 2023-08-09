//only returns true if the product is green, and the incoming date is in spring

public boolean accepts(Product product, LocalDate date) {
        Set<Month> springMonths = new HashSet<>(Arrays.asList(Month.MARCH, Month.APRIL, Month.MAY));
        return product.color().equals(Color.GREEN) && springMonths.contains(date.getMonth());
}


//less fancy solution:
public boolean accepts(Product product, LocalDate date) {
    Month month = date.getMonth();
    if (product.color().equals(Color.GREEN) && (month == Month.MARCH || month == Month.APRIL || month == Month.MAY)) {
        return true;
    } else {
        return false;
    }
}
