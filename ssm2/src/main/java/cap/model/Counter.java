package cap.model;

public class Counter {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column counter.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column counter.num
     *
     * @mbg.generated
     */
    private Long num;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column counter.id
     *
     * @return the value of counter.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column counter.id
     *
     * @param id the value for counter.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column counter.num
     *
     * @return the value of counter.num
     *
     * @mbg.generated
     */
    public Long getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column counter.num
     *
     * @param num the value for counter.num
     *
     * @mbg.generated
     */
    public void setNum(Long num) {
        this.num = num;
    }
}