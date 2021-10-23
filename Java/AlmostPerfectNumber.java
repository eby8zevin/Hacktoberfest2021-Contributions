package Java;

class AlmostPerfectNumber {
    public static String getInformation(int target) {
        int result = 0;
        for(int i = 1; i * i <= target; i++) {
            if(target % i == 0) {
                result += i;
                if(i * i != target) {
                    result += target / i;
                }
            }
        }

        String info = target + " not perfect";
        int substract = (result - target) - target;
        if(substract == 0) {
            info = target + " perfect";
        } else if (substract > 0 && substract <= 2) {
            info = target + " almost perfect";
        }

        return info;
    }

    public static void main(String[] args) {
        System.out.println("6 => " + AlmostPerfectNumber.getInformation(6));
        System.out.println("65 => " + AlmostPerfectNumber.getInformation(65));
        System.out.println("650 => " + AlmostPerfectNumber.getInformation(650));
    }
}
