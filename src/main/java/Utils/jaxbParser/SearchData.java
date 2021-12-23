package parsers.jaxb;


import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "searchData")
public class SearchData {

    @XmlElement(name="keyword")
    private String keyword;
    @XmlElement(name="brandName")
    private String brandName;
    @XmlElement(name="priceValidation")
    private String priceValidation;

    public String getKeyword() { return keyword; }

    public String getBrandName() { return brandName; }

    public String getPriceValidation() { return priceValidation; }

    @Override
    public String toString() {
        return "SearchData{" +
                "keyword='" + keyword + '\'' +
                ", brandName='" + brandName + '\'' +
                ", priceValidation=" + priceValidation +
                '}';
    }

}
