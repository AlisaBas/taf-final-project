package byitacademy.habasaraba.finalproject.pages;

public class CartPage {
    public static final String MENU_BTN_SHOP = "//button[text()='Shop']";
    public static final String SIDE_MENU_BTN = "//div[@class='nav-menu-panel__container lsco-col-md-9']//li";
    public static final String SIDE_MENU_LINK = "//div[@class='nav-l3__wrap lsco-row lsco-col-md-5 nav-menu-panel__l3--container']//a";
    public static final String ITEM_LINK = "//div[@class='product-cell'][1]/a";
    public static final String ITEM_COLOR_CHECKBOX = "//div[@class='swatches-container swatches-mweb-container']//li/button";
    public static final String ITEM_WAIST_CHECKBOX = "//div[@class='waist-wrapper']//button[(contains(@class,'size-tile-list-button'))and not(contains(@class,'unavailable'))]";
    public static final String ITEM_LENGTH_CHECKBOX = "//div[@class='length-wrapper']//button[(contains(@class,'size-tile-list-button'))and not(contains(@class,'unavailable'))]";
    public static final String ADD_TO_CART_BTN = "//button[@data-v-efc95fac]";
    public static final String CART_ICON_HEADER = "//a[@class='header-bar__cart']";
    public static final String ITEM_QUANTITY = "//div[@class='shopping-bag-title-box lsco-row lsco-row-md--between']//div[2]";
}
