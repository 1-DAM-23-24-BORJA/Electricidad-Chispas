public class Society implements Customer {




        private String clientCode;
        private String businessName;
        private String cif;
        private String postalAddress;
        private String town;
        private String provincie;
        private String email;
        private String phone;


        public String getClientCode() {
            return clientCode;
        }

        public void setClientCode(String clientCode) {
            this.clientCode = clientCode;
        }

        @Override
        public String getFullName() {
            return businessName;
        }

        @Override
        public String getId() {
            return cif;
        }

        public String getBusinessName() {
            return businessName;
        }

        public void setBusinessName(String businessName) {
            this.businessName = businessName;
        }

        public String getCif() {
            return cif;
        }

        public void setCif(String Id) {
            this.cif = Id;
        }

        public String getPostalAddress() {
            return postalAddress;
        }

        public void setPostalAddress(String postalAddress) {
            this.postalAddress = postalAddress;
        }

        public String getTown() {
            return town;
        }

        public void setTown(String town) {
            this.town = town;
        }

        @Override
        public String getProvince() {
            return null;
        }

        @Override
        public void setProvince(String province) {

        }

        public String getProvincie() {
            return provincie;
        }

        public void setProvincie(String provincie) {
            this.provincie = provincie;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "Society{" +
                    "clientCode='" + clientCode + '\'' +
                    ", businessName='" + businessName + '\'' +
                    ", cif='" + cif + '\'' +
                    ", postalAddress='" + postalAddress + '\'' +
                    ", town='" + town + '\'' +
                    ", provincie='" + provincie + '\'' +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }




}
