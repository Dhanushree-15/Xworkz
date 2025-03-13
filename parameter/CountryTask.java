class CountryTask {
    public static void printCountriesEndingWithA(Set<String> countries) {
        for (String country : countries) {
            if (country.endsWith("a") || country.endsWith("A")) {
                System.out.println(country);
            }
        }
    }

    public static void main(String[] args) {
        Set<String> countries = Set.of("India", "Canada", "Germany", "Australia");
        printCountriesEndingWithA(countries);
    }
}