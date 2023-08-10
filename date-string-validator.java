//using LocalDate, and recursion
private LocalDate getDate() {
        String input = scanner.nextLine();
        try {
            return LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date. Please enter the date in the format yyyy-MM-dd");
            return getDate();
        }
    }
