package net.authorize;


/**
 * Enumeration to handle all the x_ field names and xml element names
 */
public enum AuthNetField {
	ELEMENT__ACCOUNT_NUMBER("AccountNumber"),
	ELEMENT__ACCOUNT_TYPE("AccountType"),
	ELEMENT__AUTH_CODE("AuthCode"),
	ELEMENT__AVS_RESPONSE("AVSResponse"),
	ELEMENT__AVS_RESULT_CODE("AVSResultCode"),
	ELEMENT__CAVV_RESPONSE("CAVVResponse"),
	ELEMENT__CODE("Code"),
	ELEMENT__CVV_RESULT_CODE("CVVResultCode"),
	ELEMENT__DESCRIPTION("Description"),
	ELEMENT__ERROR("Error"),
	ELEMENT__ERROR_CODE("ErrorCode"),
	ELEMENT__ERROR_TEXT("ErrorText"),
	ELEMENT__FDS_FILTER("FDSFilter"),
	ELEMENT__FDS_FILTER_ACTION("FDSFilterAction"),
	ELEMENT__FDS_FILTERS("FDSFilters"),
	ELEMENT__MESSAGE("Message"),
	ELEMENT__REF_TRANS_ID("RefTransID"),
	ELEMENT__RESPONSE_CODE("ResponseCode"),
	ELEMENT__TEST_MODE("TestMode"),
	ELEMENT__TRANS_HASH("TransHash"),
	ELEMENT__TRANS_ID("TransID"),
	ELEMENT__USER_REF("UserRef"),
	ELEMENT_ACCOUNT_NUMBER("accountNumber"),
	ELEMENT_ACCOUNT_TYPE("accountType"),
	ELEMENT_ACTION("action"),
	ELEMENT_ADDRESS("address"),
	ELEMENT_AMOUNT("amount"),
	ELEMENT_APPROVAL_CODE("approvalCode"),
	ELEMENT_APPROVED_AMOUNT("approvedAmount"),
	ELEMENT_AUTH_AMOUNT("authAmount"),
	ELEMENT_AUTH_CODE("authCode"),
	ELEMENT_AVS_RESULT_CODE("avsResultCode"),
	ELEMENT_BALANCE_ON_CARD("balanceOnCard"),
	ELEMENT_BANK_ACCOUNT("bankAccount"),
	ELEMENT_BANK_ACCOUNT_NUMBER_MASKED("bankAccountNumberMasked"),
	ELEMENT_BANK_NAME("bankName"),
	ELEMENT_BANK_ROUTING_NUMBER_MASKED("bankRoutingNumberMasked"),
	ELEMENT_BATCH("batch"),
	ELEMENT_BATCH_ID("batchId"),
	ELEMENT_BATCH_LIST("batchList"),
	ELEMENT_BILL_TO("billTo"),
	ELEMENT_CARD_CODE("cardCode"),
	ELEMENT_CARD_CODE_RESPONSE("cardCodeResponse"),
	ELEMENT_CARD_NUMBER("cardNumber"),
	ELEMENT_CAVV_RESULT_CODE("cavvResultCode"),
	ELEMENT_CHARGE_AMOUNT("chargeAmount"),
	ELEMENT_CHARGE_CHARGEBACK_AMOUNT("chargeChargeBackAmount"),
	ELEMENT_CHARGE_CHARGEBACK_COUNT("chargeChargeBackCount"),
	ELEMENT_CHARGE_COUNT("chargeCount"),
	ELEMENT_CHARGE_RETURNED_ITEMS_AMOUNT("chargeReturnedItemsAmount"),
	ELEMENT_CHARGE_RETURNED_ITEMS_COUNT("chargeReturnedItemsCount"),
	ELEMENT_CHARGEBACK_AMOUNT("chargebackAmount"),
	ELEMENT_CHARGEBACK_COUNT("chargebackCount"),
	ELEMENT_CITY("city"),
	ELEMENT_CODE("code"),
	ELEMENT_COMPANY("company"),
	ELEMENT_CORRECTION_NOTICE_COUNT("correctionNoticeCount"),
	ELEMENT_COUNTRY("country"),
	ELEMENT_CREATE_TRANSACTION_REQUEST("createTransactionRequest"),
	ELEMENT_CREDIT_CARD("creditCard"),
	ELEMENT_CREDIT_CARD_EXPIRY("expirationDate"),
	ELEMENT_CREDIT_CARD_NUMBER("cardNumber"),
	ELEMENT_CREDIT_CARD_NUMBER_MASKED("creditCardNumberMasked"),
	ELEMENT_CURRENCY_CODE("currencyCode"),
	ELEMENT_CUSTOMER("customer"),
	ELEMENT_CUSTOMER_ADDRESS_ID("customerAddressId"),
	ELEMENT_CUSTOMER_EMAIL("customerEmail"),
	ELEMENT_CUSTOMER_IP("customerIP"),
	ELEMENT_CUSTOMER_PAYMENT_PROFILE_ID("customerPaymentProfileId"),
	ELEMENT_CUSTOMER_PAYMENT_PROFILE_ID_LIST("customerPaymentProfileIdList"),
	ELEMENT_CUSTOMER_PROFILE_ID("customerProfileId"),
	ELEMENT_CUSTOMER_SHIPPING_ADDRESS_ID("customerShippingAddressId"),
	ELEMENT_CUSTOMER_SHIPPING_ADDRESS_ID_LIST("customerShippingAddressIdList"),
	ELEMENT_CUSTOMER_TYPE("customerType"),
	ELEMENT_CVV_RESULT_CODE("cvvResultCode"),
	ELEMENT_DATA_CAPITAL("Data"),
	ELEMENT_PIN_CAPITAL("PIN"),
	ELEMENT_DECLINE_COUNT("declineCount"),
	ELEMENT_DESCRIPTION("description"),
	ELEMENT_DESCRIPTION_CAPITAL("Description"),
	ELEMENT_DEVICE_INFO("DeviceInfo"),
	ELEMENT_DEVICE_TYPE("deviceType"),
	ELEMENT_DIRECT_RESPONSE("directResponse"),
	ELEMENT_DRIVER_LICENSE("driversLicense"),
	ELEMENT_DUKPT("DUKPT"),
	ELEMENT_DUTY("duty"),
	ELEMENT_ECHECK_TYPE("echeckType"),
	ELEMENT_EMAIL("email"),
	ELEMENT_ENCODING("Encoding"),
	ELEMENT_ENCRYPTION_ALGORITHM("EncryptionAlgorithm"),
	ELEMENT_ERROR("error"),	
	ELEMENT_ENCRYPTED_TRACK_DATA("encryptedTrackData"),	
	ELEMENT_ERROR_CODE("errorCode"),
	ELEMENT_ERROR_COUNT("errorCount"),
	ELEMENT_ERROR_TEXT("errorText"),
	ELEMENT_ERRORS("errors"),
	ELEMENT_EXPIRATION_DATE("expirationDate"),
	ELEMENT_EXTRA_OPTIONS("extraOptions"),
	ELEMENT_FAX_NUMBER("faxNumber"),
	ELEMENT_FIRST_NAME("firstName"),
	ELEMENT_FIRST_SETTLEMENT_DATE("firstSettlementDate"),
	ELEMENT_FOOTER_EMAIL_RECEIPT("footerEmailReceipt"),
	ELEMENT_FORM_OF_PAYMENT("FormOfPayment"),
	ELEMENT_HEADER_EMAIL_RECEIPT("headerEmailReceipt"),
	ELEMENT_ID("id"),
	ELEMENT_IDS("ids"),
	ELEMENT_INCLUDE_STATISTICS("includeStatistics"),
	ELEMENT_INTERVAL("interval"),
	ELEMENT_INVOICE_NUMBER("invoiceNumber"),
	ELEMENT_ITEM_ID("itemId"),
	ELEMENT_LAST_NAME("lastName"),
	ELEMENT_LAST_SETTLEMENT_DATE("lastSettlementDate"),
	ELEMENT_LENGTH("length"),
	ELEMENT_LINE_ITEM("lineItem"),
	ELEMENT_LINE_ITEMS("lineItems"),
	ELEMENT_MARKET_TYPE("marketType"),
	ELEMENT_MERCHANT_ADDRESS("merchantAddress"),
	ELEMENT_MERCHANT_AUTHENTICATION("merchantAuthentication"),
	ELEMENT_MERCHANT_CITY("merchantCity"),
	ELEMENT_MERCHANT_CONTACT("merchantContact"),
	ELEMENT_MERCHANT_CUSTOMER_ID("merchantCustomerId"),
	ELEMENT_MERCHANT_EMAIL("merchantEmail"),
	ELEMENT_MERCHANT_NAME("merchantName"),
	ELEMENT_MERCHANT_PHONE("merchantPhone"),
	ELEMENT_MERCHANT_STATE("merchantState"),
	ELEMENT_MERCHANT_ZIP("merchantZip"),
	ELEMENT_MERCHANT_ACCOUNT("merchantAccount"),
	ELEMENT_MESSAGE("message"),
	ELEMENT_MESSAGES("messages"),
	ELEMENT_MOBILE_DEVICE("mobileDevice"),
	ELEMENT_MOBILE_DEVICE_ID("mobileDeviceId"),
	ELEMENT_MODE("Mode"),
	ELEMENT_NAME("name"),
	ELEMENT_NAME_ALLOW_PARTIAL_AUTH("allowPartialAuth"),
	ELEMENT_NAME_DUPLICATE_WINDOW("duplicateWindow"),
	ELEMENT_NAME_EMAIL_CUSTOMER("emailCustomer"),
	ELEMENT_NAME_ON_ACCOUNT("nameOnAccount"),
	ELEMENT_NAME_RECURRING_BILLING("recurringBilling"),
	ELEMENT_NAME_TEST_REQUEST("testRequest"),
	ELEMENT_OPERATION("Operation"),
	ELEMENT_ORDER("order"),
	ELEMENT_PASSWORD("password"),
	ELEMENT_PAYMENT("payment"),
	ELEMENT_PAYMENT_METHOD("paymentMethod"),
	ELEMENT_PAYMENT_PROFILE("paymentProfile"),
	ELEMENT_PAYMENT_PROFILES("paymentProfiles"),
	ELEMENT_PAYMENT_SCHEDULE("paymentSchedule"),
	ELEMENT_PERMISSION("permission"),
	ELEMENT_PERMISSION_NAME("permissionName"),
	ELEMENT_PHONE_NUMBER("phoneNumber"),
	ELEMENT_DEVICE_PLATFORM("devicePlatform"),
	ELEMENT_PO_NUMBER("poNumber"),
	ELEMENT_PREPAID_BALANCE_REMAINING("prepaidBalanceRemaining"),
	ELEMENT_PREPAID_CARD("prePaidCard"),
	ELEMENT_PROFILE("profile"),
	ELEMENT_PROFILE_TRANS_AUTH_ONLY("profileTransAuthOnly"),
	ELEMENT_PURCHASE_ORDER_NUMBER("purchaseOrderNumber"),
	ELEMENT_QUANTITY("quantity"),
	ELEMENT_RECURRING_BILLING("recurringBilling"),
	ELEMENT_REF_TRANS_HASH("refTransHash"),
	ELEMENT_REF_TRANS_ID("refTransId"),
	ELEMENT_REF_TRANS_IDD("refTransID"),
	ELEMENT_REFID("refId"),
	ELEMENT_REFUND_AMOUNT("refundAmount"),
	ELEMENT_REFUND_CHARGEBACK_AMOUNT("refundChargeBackAmount"),
	ELEMENT_REFUND_CHARGEBACK_COUNT("refundChargeBackCount"),
	ELEMENT_REFUND_COUNT("refundCount"),
	ELEMENT_REFUND_RETURNED_ITEMS_AMOUNT("refundReturnedItemsAmount"),
	ELEMENT_REFUND_RETURNED_ITEMS_COUNT("refundReturnedItemsCount"),
	ELEMENT_REQUESTED_AMOUNT("requestedAmount"),
	ELEMENT_RESPONSE_CODE("responseCode"),
	ELEMENT_RESPONSE_REASON_CODE("responseReasonCode"),
	ELEMENT_RESPONSE_REASON_DESCRIPTION("responseReasonDescription"),
	ELEMENT_RESPONSE_TO_CUSTOMER("responseToCustomer"),
	ELEMENT_RESULT_CODE("resultCode"),
	ELEMENT_RETAIL("retail"),
	ELEMENT_RETURNED_ITEM_AMOUNT("returnedItemAmount"),
	ELEMENT_RETURNED_ITEM_COUNT("returnedItemCount"),
	ELEMENT_ROUTING_NUMBER("routingNumber"),
	ELEMENT_SCHEME("Scheme"),
	ELEMENT_SESSION_TOKEN("sessionToken"),
	ELEMENT_SETTING("setting"),
	ELEMENT_SETTING_NAME("settingName"),
	ELEMENT_SETTING_VALUE("settingValue"),
	ELEMENT_SETTLE_AMOUNT("settleAmount"),
	ELEMENT_SETTLEMENT_STATE("settlementState"),
	ELEMENT_SETTLEMENT_TIME_LOCAL("settlementTimeLocal"),
	ELEMENT_SETTLEMENT_TIME_UTC("settlementTimeUTC"),
	ELEMENT_SHIP_TO("shipTo"),
	ELEMENT_SHIP_TO_LIST("shipToList"),
	ELEMENT_SHIPPING("shipping"),
	ELEMENT_SPLIT_TENDER_ID("splitTenderId"),
	ELEMENT_SPLIT_TENDER_PAYMENT("splitTenderPayment"),
	ELEMENT_SPLIT_TENDER_PAYMENTS("splitTenderPayments"),
	ELEMENT_SPLIT_TENDER_STATUS("splitTenderStatus"),
	ELEMENT_START_DATE("startDate"),
	ELEMENT_STATE("state"),
	ELEMENT_STATISTIC("statistic"),
	ELEMENT_STATISTICS("statistics"),
	ELEMENT_SUBMIT_TIME_LOCAL("submitTimeLocal"),
	ELEMENT_SUBMIT_TIME_UTC("submitTimeUTC"),
	ELEMENT_SUBSCRIPTION("subscription"),
	ELEMENT_SUBSCRIPTION_ID("subscriptionId"),
	ELEMENT_SUBSCRIPTION_STATUS("Status"),
	ELEMENT_SWIPER_DATA("swiperData"),
	ELEMENT_ENCRYPTED_DATA("EncryptedData"),
	ELEMENT_TAX("tax"),
	ELEMENT_TAX_EXEMPT("taxExempt"),
	ELEMENT_TAX_ID("taxId"),
	ELEMENT_TAXABLE("taxable"),
	ELEMENT_TEST_REQUEST("testRequest"),
	ELEMENT_TEXT("text"),
	ELEMENT_TOTAL_OCCURRENCES("totalOccurrences"),
	ELEMENT_TRACK_DATA("trackData"),
	ELEMENT_TRACK1("track1"),
	ELEMENT_TRACK2("track2"),
	ELEMENT_TRANS_HASH("transHash"),
	ELEMENT_TRANS_ID("transId"),
	ELEMENT_TRANSACTION("transaction"),
	ELEMENT_TRANSACTION_ID("transactionId"),
	ELEMENT_TRANSACTION_KEY("transactionKey"),
	ELEMENT_TRANSACTION_REQUEST("transactionRequest"),
	ELEMENT_TRANSACTION_RESPONSE("transactionResponse"),
	ELEMENT_TRANSACTION_SETTINGS("transactionSettings"),
	ELEMENT_TRANSACTION_STATUS("transactionStatus"),
	ELEMENT_TRANSACTION_TYPE("transactionType"),
	ELEMENT_TRANSACTIONS("transactions"),
	ELEMENT_TRIAL_AMOUNT("trialAmount"),
	ELEMENT_TRIAL_OCCURRENCES("trialOccurrences"),
	ELEMENT_TYPE("type"),
	ELEMENT_UNIT("unit"),
	ELEMENT_UNIT_PRICE("unitPrice"),
	ELEMENT_USER_FIELD("userField"),
	ELEMENT_USER_FIELDS("userFields"),
	ELEMENT_USER_PERMISSIONS("userPermissions"),
	ELEMENT_VALIDATION_DIRECT_RESPONSE("validationDirectResponse"),
	ELEMENT_VALIDATION_DIRECT_RESPONSE_LIST("validationDirectResponseList"),
	ELEMENT_VALIDATION_MODE("validationMode"),
	ELEMENT_VALUE("value"),
	ELEMENT_VALUE_CAPITAL("Value"),
	ELEMENT_VOID_COUNT("voidCount"),
	ELEMENT_ZIP("zip"),
	X_ACCOUNT_NUMBER("x_account_number"),
	X_ADDRESS("x_address"),
	X_ALLOW_PARTIAL_AUTH("x_allow_partial_Auth"),
	X_AMOUNT("x_amount"),
	X_AUTH_CODE("x_auth_code"),
	X_AUTHENTICATION_INDICATOR("x_authentication_indicator"),
	X_AVS_CODE("x_avs_code"),
	X_BACKGROUND_URL("x_background_url"),
	X_BANK_ABA_CODE("x_bank_aba_code"),
	X_BANK_ACCT_NAME("x_bank_acct_name"),
	X_BANK_ACCT_NUM("x_bank_acct_num"),
	X_BANK_ACCT_TYPE("x_bank_acct_type"),
	X_BANK_CHECK_NUMBER("x_bank_check_number"),
	X_BANK_NAME("x_bank_name"),
	X_CARD_CODE("x_card_code"),
	X_CARD_NUM("x_card_num"),
	X_CARD_TYPE("x_card_type"),
	X_CARDHOLDER_AUTHENTICATION_VALUE("x_cardholder_authentication_value"),
	X_CAVV_RESPONSE("x_cavv_response"),
	X_CITY("x_city"),
	X_COLOR_BACKGROUND("x_color_background"),
	X_COLOR_LINK("x_color_link"),
	X_COLOR_TEXT("x_color_text"),
	X_COMPANY("x_company"),
	X_COUNTRY("x_country"),
	X_CPVERSION("x_cpversion"),
	X_CURRENCY_CODE("x_currency_code"),
	X_CUST_ID("x_cust_id"),
	X_CUSTOMER_IP("x_customer_ip"),
	X_CVV2_RESP_CODE("x_cvv2_resp_code"),
	X_DELIM_CHAR_FIELD("x_delim_char"),
	X_DELIM_DATA("x_delim_data"),
	X_DELIM_DATA_FIELD("x_delim_data"),
	X_DESCRIPTION("x_description"),
	X_DEVICE_TYPE("x_device_type"),
	X_DUPLICATE_WINDOW("x_duplicate_window"),
	X_DUTY("x_duty"),
	X_ECHECK_TYPE("x_echeck_type"),
	X_EMAIL("x_email"),
	X_EMAIL_CUSTOMER("x_email_customer"),
	X_ENCAP_CHAR("x_encap_char"),
	X_EXP_DATE("x_exp_date"),
	X_FAX("x_fax"),
	X_FIRST_NAME("x_first_name"),
	X_FOOTER_EMAIL_RECEIPT("x_footer_email_receipt"),
	X_FOOTER_HTML_PAYMENT_FORM("x_footer_html_payment_form"),
	X_FP_HASH("x_fp_hash"),
	X_FP_SEQUENCE("x_fp_sequence"),
	X_FP_TIMESTAMP("x_fp_timestamp"),
	X_FREIGHT("x_freight"),
	X_HEADER_EMAIL_RECEIPT("x_header_email_receipt"),
	X_HEADER_HTML_PAYMENT_FORM("x_header_html_payment_form"),
    X_INVOICE_NUM("x_invoice_num"),
    X_LAST_NAME("x_last_name"),
    X_LINE_ITEM("x_line_item"),
    X_LOGIN("x_login"),
	X_LOGO_URL("x_logo_url"),
	X_MARKET_TYPE("x_market_type"),
	X_MD5_HASH("x_MD5_Hash"),
	X_MERCHANT_EMAIL("x_merchant_email"),
	X_METHOD("x_method"),
	X_PHONE("x_phone"),
	X_PO_NUM("x_po_num"),
	X_PREPAID_BALANCE_ON_CARD("x_prepaid_balance_on_card"),
	X_PREPAID_REQUESTED_AMOUNT("x_prepaid_requested_amount"),
	X_RECEIPT_LINK_METHOD("x_receipt_link_method"),
	X_RECEIPT_LINK_TEXT("x_receipt_link_text"),
	X_RECEIPT_LINK_URL("x_receipt_link_url"),
	X_RECURRING_BILLING("x_recurring_billing"),
	X_RELAY_RESPONSE("x_relay_response"),
	X_RELAY_URL("x_relay_url"),
	X_RENAME("x_rename"),
	X_RESPONSE_CODE("x_response_code"),
	X_RESPONSE_FORMAT("x_response_format"),
	X_RESPONSE_REASON_CODE("x_response_reason_code"),
	X_RESPONSE_REASON_TEXT("x_response_reason_text"),
	X_SHIP_TO_ADDRESS("x_ship_to_address"),
	X_SHIP_TO_CITY("x_ship_to_city"),
	X_SHIP_TO_COMPANY("x_ship_to_company"),
	X_SHIP_TO_COUNTRY("x_ship_to_country"),
	X_SHIP_TO_FIRST_NAME("x_ship_to_first_name"),
	X_SHIP_TO_LAST_NAME("x_ship_to_last_name"),
	X_SHIP_TO_STATE("x_ship_to_state"),
	X_SHIP_TO_ZIP("x_ship_to_zip"),
	X_SHOW_FORM("x_show_form"),
	X_SPLIT_TENDER_ID("x_split_tender_id"),
	X_STATE("x_state"),
	X_TAX("x_tax"),
	X_TAX_EXEMPT("x_tax_exempt"),
	X_TEST_REQUEST("x_test_request"),
	X_TRACK1("x_track1"),
	X_TRACK2("x_track2"),
	X_TRAN_KEY("x_tran_key"),
	X_TRANS_ID("x_trans_id"),
	X_TYPE("x_type"),
	X_USER_REF("x_user_ref"),
	X_VERSION_FIELD("x_version"),
	X_ZIP("x_zip");

	final private String fieldName;

	private AuthNetField(String fieldName) {
		this.fieldName = fieldName;
	}

	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}


}
