package certification.notebook;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Search {

    /**
     * Search by brand of manufacturer
     *
     * @param brand
     */
    public void searchByBrand(String brand, Set dataBase) {
        for (Object notebookItem : dataBase) {
            if (notebookItem.toString().toLowerCase().contains(brand.toLowerCase()))
                System.out.println(notebookItem.toString());
        }
    }

    /**
     * Search by RAM in given interval
     *
     * @param minRam
     * @param maxRam
     * @param dataBase
     */
    public void searchByRam(Integer minRam, Integer maxRam, Set dataBase) {
        for (Object notebookItem : dataBase) {
            int ram = Integer.parseInt(findRegex(notebookItem.toString(), "(?<=RAM\\s)[0-9]{1,2}(?=\\sGB)"));
            if (ram >= minRam && ram <= maxRam) {
                System.out.println(notebookItem);
            }
        }
    }


    /**
     * Search by HDD in given interval
     *
     * @param minHdd
     * @param maxHdd
     * @param dataBase
     */
    public void searchByHdd(Integer minHdd, Integer maxHdd, Set dataBase) {
        for (Object notebookItem : dataBase) {
            int ram = Integer.parseInt(findRegex(notebookItem.toString(), "(?<=HDD\\s)[0-9]{3,4}(?=\\sGB)"));
            if (ram >= minHdd && ram <= maxHdd) {
                System.out.println(notebookItem);
            }
        }
    }

    /**
     * Search by notebook color (OS)
     * @param color
     */
    public void searchByColor(String color, Set dataBase) {
        for (Object notebookItem : dataBase) {
            if (notebookItem.toString().toLowerCase().contains(color.toLowerCase()))
                System.out.println(notebookItem.toString());
        }
    }

    /**
     * Search by Operating system (OS)
     * @param os
     */
    public void searchByOS(String os, Set dataBase) {
        for (Object notebookItem : dataBase) {
            if (notebookItem.toString().toLowerCase().contains(os.toLowerCase()))
                System.out.println(notebookItem.toString());
        }
    }

    /**
     * Regular expression search in string
     *
     * @param inStr
     * @return
     */
    private String findRegex(String inStr, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inStr);
        return matcher.find() ? matcher.group() : "";
    }

    /**Search by price interval
     *
     * @param minPrice
     * @param maxPrice
     * @param dataBase
     */
    public void searchByPrice (Integer minPrice, Integer maxPrice, Set dataBase) {
        for (Object notebookItem : dataBase) {
            int ram = Integer.parseInt(findRegex(notebookItem.toString(), "(?<=Price:\\s)[0-9]{5,6}(?=\\srub.)"));
            if (ram >= minPrice && ram <= maxPrice) {
                System.out.println(notebookItem);
            }
        }
    }
}

