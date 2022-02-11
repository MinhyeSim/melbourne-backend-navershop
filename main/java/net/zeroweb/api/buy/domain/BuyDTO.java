package net.zeroweb.api.buy.domain;

import net.zeroweb.api.buy.service.BuyService;

/**
 * packageName: net.zeroweb.api.buy.domain
 * fileName   : BuyDTO
 * author     : MinHye_Sim
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11   MinHye_Sim   최초 생성
 */
public class BuyDTO {
    int num;
    String men_Id;
    String prod_Name;
    String group_Name;
    int price;
    int amount;

    private final static BuyDTO buyDTO = new BuyDTO();
    private BuyDTO(){}
    public static BuyDTO getInstance(){return buyDTO;}

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getMen_Id() {
        return men_Id;
    }

    public void setMen_Id(String men_Id) {
        this.men_Id = men_Id;
    }

    public String getProd_Name() {
        return prod_Name;
    }

    public void setProd_Name(String prod_Name) {
        this.prod_Name = prod_Name;
    }

    public String getGroup_Name() {
        return group_Name;
    }

    public void setGroup_Name(String group_Name) {
        this.group_Name = group_Name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
