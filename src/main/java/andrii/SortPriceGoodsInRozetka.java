package andrii;

import java.util.List;

public class SortPriceGoodsInRozetka {
    public SortPriceGoodsInRozetka(WebDriver driver) {
        super(driver);
    }


    public void clickSortPrice() {
        WebElement dropDown = getClickableElement("//select");
        Select select = new Select(dropDown);
        select.selectByIndex(1);
    }

    public List<WebElement> searchGoods() {
        return getListVisibleElement("//span[@class=\"goods-tile__price-value\"]");
    }
}
}
