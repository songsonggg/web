package com.example.web.pojo;
import java.io.Serializable;
import java.util.*;

/**
*
*  @author SongsongWang
*/
public class MmallCart implements Serializable {

    private static final long serialVersionUID = 1587221786097L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 
    * isNullAble:0
    */
    private Integer userId;

    /**
    * 商品id
    * isNullAble:1
    */
    private Integer productId;

    /**
    * 数量
    * isNullAble:1
    */
    private Integer quantity;

    /**
    * 是否选择,1=已勾选,0=未勾选
    * isNullAble:1
    */
    private Integer checked;

    /**
    * 创建时间
    * isNullAble:1
    */
    private Date createTime;

    /**
    * 更新时间
    * isNullAble:1
    */
    private Date updateTime;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setUserId(Integer userId){this.userId = userId;}

    public Integer getUserId(){return this.userId;}

    public void setProductId(Integer productId){this.productId = productId;}

    public Integer getProductId(){return this.productId;}

    public void setQuantity(Integer quantity){this.quantity = quantity;}

    public Integer getQuantity(){return this.quantity;}

    public void setChecked(Integer checked){this.checked = checked;}

    public Integer getChecked(){return this.checked;}

    public void setCreateTime(Date createTime){this.createTime = createTime;}

    public Date getCreateTime(){return this.createTime;}

    public void setUpdateTime(Date updateTime){this.updateTime = updateTime;}

    public Date getUpdateTime(){return this.updateTime;}
    @Override
    public String toString() {
        return "MmallCart{" +
                "id='" + id + '\'' +
                "userId='" + userId + '\'' +
                "productId='" + productId + '\'' +
                "quantity='" + quantity + '\'' +
                "checked='" + checked + '\'' +
                "createTime='" + createTime + '\'' +
                "updateTime='" + updateTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MmallCart set;

        private ConditionBuilder where;

        public UpdateBuilder set(MmallCart set){
            this.set = set;
            return this;
        }

        public MmallCart getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends MmallCart{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<Integer> productIdList;

        public List<Integer> getProductIdList(){return this.productIdList;}

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){return this.productIdSt;}

        public Integer getProductIdEd(){return this.productIdEd;}

        private List<Integer> quantityList;

        public List<Integer> getQuantityList(){return this.quantityList;}

        private Integer quantitySt;

        private Integer quantityEd;

        public Integer getQuantitySt(){return this.quantitySt;}

        public Integer getQuantityEd(){return this.quantityEd;}

        private List<Integer> checkedList;

        public List<Integer> getCheckedList(){return this.checkedList;}

        private Integer checkedSt;

        private Integer checkedEd;

        public Integer getCheckedSt(){return this.checkedSt;}

        public Integer getCheckedEd(){return this.checkedEd;}

        private List<Date> createTimeList;

        public List<Date> getCreateTimeList(){return this.createTimeList;}

        private Date createTimeSt;

        private Date createTimeEd;

        public Date getCreateTimeSt(){return this.createTimeSt;}

        public Date getCreateTimeEd(){return this.createTimeEd;}

        private List<Date> updateTimeList;

        public List<Date> getUpdateTimeList(){return this.updateTimeList;}

        private Date updateTimeSt;

        private Date updateTimeEd;

        public Date getUpdateTimeSt(){return this.updateTimeSt;}

        public Date getUpdateTimeEd(){return this.updateTimeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder userIdBetWeen(Integer userIdSt,Integer userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public QueryBuilder userIdGreaterEqThan(Integer userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public QueryBuilder userIdLessEqThan(Integer userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public QueryBuilder userId(Integer userId){
            setUserId(userId);
            return this;
        }

        public QueryBuilder userIdList(Integer ... userId){
            this.userIdList = solveNullList(userId);
            return this;
        }

        public QueryBuilder userIdList(List<Integer> userId){
            this.userIdList = userId;
            return this;
        }

        public QueryBuilder fetchUserId(){
            setFetchFields("fetchFields","userId");
            return this;
        }

        public QueryBuilder excludeUserId(){
            setFetchFields("excludeFields","userId");
            return this;
        }

        public QueryBuilder productIdBetWeen(Integer productIdSt,Integer productIdEd){
            this.productIdSt = productIdSt;
            this.productIdEd = productIdEd;
            return this;
        }

        public QueryBuilder productIdGreaterEqThan(Integer productIdSt){
            this.productIdSt = productIdSt;
            return this;
        }
        public QueryBuilder productIdLessEqThan(Integer productIdEd){
            this.productIdEd = productIdEd;
            return this;
        }


        public QueryBuilder productId(Integer productId){
            setProductId(productId);
            return this;
        }

        public QueryBuilder productIdList(Integer ... productId){
            this.productIdList = solveNullList(productId);
            return this;
        }

        public QueryBuilder productIdList(List<Integer> productId){
            this.productIdList = productId;
            return this;
        }

        public QueryBuilder fetchProductId(){
            setFetchFields("fetchFields","productId");
            return this;
        }

        public QueryBuilder excludeProductId(){
            setFetchFields("excludeFields","productId");
            return this;
        }

        public QueryBuilder quantityBetWeen(Integer quantitySt,Integer quantityEd){
            this.quantitySt = quantitySt;
            this.quantityEd = quantityEd;
            return this;
        }

        public QueryBuilder quantityGreaterEqThan(Integer quantitySt){
            this.quantitySt = quantitySt;
            return this;
        }
        public QueryBuilder quantityLessEqThan(Integer quantityEd){
            this.quantityEd = quantityEd;
            return this;
        }


        public QueryBuilder quantity(Integer quantity){
            setQuantity(quantity);
            return this;
        }

        public QueryBuilder quantityList(Integer ... quantity){
            this.quantityList = solveNullList(quantity);
            return this;
        }

        public QueryBuilder quantityList(List<Integer> quantity){
            this.quantityList = quantity;
            return this;
        }

        public QueryBuilder fetchQuantity(){
            setFetchFields("fetchFields","quantity");
            return this;
        }

        public QueryBuilder excludeQuantity(){
            setFetchFields("excludeFields","quantity");
            return this;
        }

        public QueryBuilder checkedBetWeen(Integer checkedSt,Integer checkedEd){
            this.checkedSt = checkedSt;
            this.checkedEd = checkedEd;
            return this;
        }

        public QueryBuilder checkedGreaterEqThan(Integer checkedSt){
            this.checkedSt = checkedSt;
            return this;
        }
        public QueryBuilder checkedLessEqThan(Integer checkedEd){
            this.checkedEd = checkedEd;
            return this;
        }


        public QueryBuilder checked(Integer checked){
            setChecked(checked);
            return this;
        }

        public QueryBuilder checkedList(Integer ... checked){
            this.checkedList = solveNullList(checked);
            return this;
        }

        public QueryBuilder checkedList(List<Integer> checked){
            this.checkedList = checked;
            return this;
        }

        public QueryBuilder fetchChecked(){
            setFetchFields("fetchFields","checked");
            return this;
        }

        public QueryBuilder excludeChecked(){
            setFetchFields("excludeFields","checked");
            return this;
        }

        public QueryBuilder createTimeBetWeen(Date createTimeSt,Date createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(Date createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(Date createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(Date createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(Date ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<Date> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }

        public QueryBuilder updateTimeBetWeen(Date updateTimeSt,Date updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public QueryBuilder updateTimeGreaterEqThan(Date updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public QueryBuilder updateTimeLessEqThan(Date updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public QueryBuilder updateTime(Date updateTime){
            setUpdateTime(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(Date ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(List<Date> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public QueryBuilder fetchUpdateTime(){
            setFetchFields("fetchFields","updateTime");
            return this;
        }

        public QueryBuilder excludeUpdateTime(){
            setFetchFields("excludeFields","updateTime");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public MmallCart build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<Integer> productIdList;

        public List<Integer> getProductIdList(){return this.productIdList;}

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){return this.productIdSt;}

        public Integer getProductIdEd(){return this.productIdEd;}

        private List<Integer> quantityList;

        public List<Integer> getQuantityList(){return this.quantityList;}

        private Integer quantitySt;

        private Integer quantityEd;

        public Integer getQuantitySt(){return this.quantitySt;}

        public Integer getQuantityEd(){return this.quantityEd;}

        private List<Integer> checkedList;

        public List<Integer> getCheckedList(){return this.checkedList;}

        private Integer checkedSt;

        private Integer checkedEd;

        public Integer getCheckedSt(){return this.checkedSt;}

        public Integer getCheckedEd(){return this.checkedEd;}

        private List<Date> createTimeList;

        public List<Date> getCreateTimeList(){return this.createTimeList;}

        private Date createTimeSt;

        private Date createTimeEd;

        public Date getCreateTimeSt(){return this.createTimeSt;}

        public Date getCreateTimeEd(){return this.createTimeEd;}

        private List<Date> updateTimeList;

        public List<Date> getUpdateTimeList(){return this.updateTimeList;}

        private Date updateTimeSt;

        private Date updateTimeEd;

        public Date getUpdateTimeSt(){return this.updateTimeSt;}

        public Date getUpdateTimeEd(){return this.updateTimeEd;}


        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder userIdBetWeen(Integer userIdSt,Integer userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public ConditionBuilder userIdGreaterEqThan(Integer userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public ConditionBuilder userIdLessEqThan(Integer userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public ConditionBuilder userIdList(Integer ... userId){
            this.userIdList = solveNullList(userId);
            return this;
        }

        public ConditionBuilder userIdList(List<Integer> userId){
            this.userIdList = userId;
            return this;
        }

        public ConditionBuilder productIdBetWeen(Integer productIdSt,Integer productIdEd){
            this.productIdSt = productIdSt;
            this.productIdEd = productIdEd;
            return this;
        }

        public ConditionBuilder productIdGreaterEqThan(Integer productIdSt){
            this.productIdSt = productIdSt;
            return this;
        }
        public ConditionBuilder productIdLessEqThan(Integer productIdEd){
            this.productIdEd = productIdEd;
            return this;
        }


        public ConditionBuilder productIdList(Integer ... productId){
            this.productIdList = solveNullList(productId);
            return this;
        }

        public ConditionBuilder productIdList(List<Integer> productId){
            this.productIdList = productId;
            return this;
        }

        public ConditionBuilder quantityBetWeen(Integer quantitySt,Integer quantityEd){
            this.quantitySt = quantitySt;
            this.quantityEd = quantityEd;
            return this;
        }

        public ConditionBuilder quantityGreaterEqThan(Integer quantitySt){
            this.quantitySt = quantitySt;
            return this;
        }
        public ConditionBuilder quantityLessEqThan(Integer quantityEd){
            this.quantityEd = quantityEd;
            return this;
        }


        public ConditionBuilder quantityList(Integer ... quantity){
            this.quantityList = solveNullList(quantity);
            return this;
        }

        public ConditionBuilder quantityList(List<Integer> quantity){
            this.quantityList = quantity;
            return this;
        }

        public ConditionBuilder checkedBetWeen(Integer checkedSt,Integer checkedEd){
            this.checkedSt = checkedSt;
            this.checkedEd = checkedEd;
            return this;
        }

        public ConditionBuilder checkedGreaterEqThan(Integer checkedSt){
            this.checkedSt = checkedSt;
            return this;
        }
        public ConditionBuilder checkedLessEqThan(Integer checkedEd){
            this.checkedEd = checkedEd;
            return this;
        }


        public ConditionBuilder checkedList(Integer ... checked){
            this.checkedList = solveNullList(checked);
            return this;
        }

        public ConditionBuilder checkedList(List<Integer> checked){
            this.checkedList = checked;
            return this;
        }

        public ConditionBuilder createTimeBetWeen(Date createTimeSt,Date createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(Date createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(Date createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(Date ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<Date> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder updateTimeBetWeen(Date updateTimeSt,Date updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public ConditionBuilder updateTimeGreaterEqThan(Date updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public ConditionBuilder updateTimeLessEqThan(Date updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public ConditionBuilder updateTimeList(Date ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public ConditionBuilder updateTimeList(List<Date> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private MmallCart obj;

        public Builder(){
            this.obj = new MmallCart();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder userId(Integer userId){
            this.obj.setUserId(userId);
            return this;
        }
        public Builder productId(Integer productId){
            this.obj.setProductId(productId);
            return this;
        }
        public Builder quantity(Integer quantity){
            this.obj.setQuantity(quantity);
            return this;
        }
        public Builder checked(Integer checked){
            this.obj.setChecked(checked);
            return this;
        }
        public Builder createTime(Date createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder updateTime(Date updateTime){
            this.obj.setUpdateTime(updateTime);
            return this;
        }
        public MmallCart build(){return obj;}
    }

}
