package aqa_lection4;


    public class CylinderVolumeCalculator {
        public static double calculateCylinderVolume(double radius, double height) {
            return 3.14159 * (radius * radius) * height;
        }

        public static void main(String[] args) {
            double radius = 3.5;
            double height = 10;

            double volume = calculateCylinderVolume(radius, height);
            System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює: " + volume);
        }
    }


