// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: account/Account.proto

package br.com.accounts;

public interface AccountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:account.Account)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 agencyNumber = 3;</code>
   */
  int getAgencyNumber();

  /**
   * <code>int32 accountNumber = 4;</code>
   */
  int getAccountNumber();

  /**
   * <code>float balance = 5;</code>
   */
  float getBalance();
}
