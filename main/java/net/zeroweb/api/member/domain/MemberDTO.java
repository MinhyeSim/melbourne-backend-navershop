package net.zeroweb.api.member.domain;

/**
 * packageName: net.zeroweb.api.member.domain
 * fileName   : MemberDTO
 * author     : MinHye_Sim
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11   MinHye_Sim   최초 생성
 */
public class MemberDTO {

    String menId;
    String menName;
    int menNumber;
    String addr;
    String phone1;
    String phone2;
    int height;
    String debutDate;

    private final static MemberDTO memberDTO = new MemberDTO();
    private MemberDTO(){}
    public static MemberDTO getInstance(){return memberDTO;}

    public String getMem_Id() {
        return menId;
    }

    public void setMem_Id(String mem_Id) {
        this.menId = mem_Id;
    }

    public String getMen_Name() {
        return menName;
    }

    public void setMen_Name(String men_Name) {
        this.menName = men_Name;
    }

    public int getMen_Number() {
        return menNumber;
    }

    public void setMen_Number(int men_Number) {
        this.menNumber = men_Number;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDebut_date() {
        return debutDate;
    }

    public void setDebut_date(String debut_date) {
        this.debutDate = debut_date;
    }
}
