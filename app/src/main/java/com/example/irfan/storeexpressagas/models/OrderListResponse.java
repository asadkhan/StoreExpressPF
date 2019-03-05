package com.example.irfan.storeexpressagas.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OrderListResponse {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("iserror")
    @Expose
    private Boolean iserror;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("value")
    @Expose
    private List<Value> value = null;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getIserror() {
        return iserror;
    }

    public void setIserror(Boolean iserror) {
        this.iserror = iserror;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Value> getValue() {
        return value;
    }

    public void setValue(List<Value> value) {
        this.value = value;
    }


    public class Value {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("customerId")
        @Expose
        private String customerId;
        @SerializedName("customerName")
        @Expose
        private String customerName;
        @SerializedName("total")
        @Expose
        private Integer total;
        @SerializedName("tax")
        @Expose
        private Integer tax;
        @SerializedName("orderTime")
        @Expose
        private String orderTime;
        @SerializedName("orderStatus")
        @Expose
        private Integer orderStatus;
        @SerializedName("orderStatus1")
        @Expose
        private String orderStatus1;
        @SerializedName("orderItem")
        @Expose
        private List<OrderItem> orderItem = null;
        @SerializedName("orderType")
        @Expose
        private String orderType;
        @SerializedName("paymentMeathod")
        @Expose
        private String paymentMeathod;
        @SerializedName("paymentStatus")
        @Expose
        private String paymentStatus;
        @SerializedName("address")
        @Expose
        private Object address;
        @SerializedName("contactNo")
        @Expose
        private Object contactNo;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getCustomerId() {
            return customerId;
        }

        public void setCustomerId(String customerId) {
            this.customerId = customerId;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public Integer getTax() {
            return tax;
        }

        public void setTax(Integer tax) {
            this.tax = tax;
        }

        public String getOrderTime() {
            return orderTime;
        }

        public void setOrderTime(String orderTime) {
            this.orderTime = orderTime;
        }

        public Integer getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
        }

        public String getOrderStatus1() {
            return orderStatus1;
        }

        public void setOrderStatus1(String orderStatus1) {
            this.orderStatus1 = orderStatus1;
        }

        public List<OrderItem> getOrderItem() {
            return orderItem;
        }

        public void setOrderItem(List<OrderItem> orderItem) {
            this.orderItem = orderItem;
        }

        public String getOrderType() {
            return orderType;
        }

        public void setOrderType(String orderType) {
            this.orderType = orderType;
        }

        public String getPaymentMeathod() {
            return paymentMeathod;
        }

        public void setPaymentMeathod(String paymentMeathod) {
            this.paymentMeathod = paymentMeathod;
        }

        public String getPaymentStatus() {
            return paymentStatus;
        }

        public void setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
        }

        public Object getAddress() {
            return address;
        }

        public void setAddress(Object address) {
            this.address = address;
        }

        public Object getContactNo() {
            return contactNo;
        }

        public void setContactNo(Object contactNo) {
            this.contactNo = contactNo;
        }


        public class OrderItem {

            @SerializedName("id")
            @Expose
            private Integer id;
            @SerializedName("orderId")
            @Expose
            private Integer orderId;
            @SerializedName("itemId")
            @Expose
            private Integer itemId;
            @SerializedName("itemName")
            @Expose
            private String itemName;
            @SerializedName("quantity")
            @Expose
            private Integer quantity;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public Integer getOrderId() {
                return orderId;
            }

            public void setOrderId(Integer orderId) {
                this.orderId = orderId;
            }

            public Integer getItemId() {
                return itemId;
            }

            public void setItemId(Integer itemId) {
                this.itemId = itemId;
            }

            public String getItemName() {
                return itemName;
            }

            public void setItemName(String itemName) {
                this.itemName = itemName;
            }

            public Integer getQuantity() {
                return quantity;
            }

            public void setQuantity(Integer quantity) {
                this.quantity = quantity;
            }

        }

    }
}
