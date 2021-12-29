// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/did/v2/did.proto

package panacea.did.v2;

public interface DIDDocumentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:panacea.did.v2.DIDDocument)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.panacea.did.v2.Strings contexts = 1 [json_name = "&#64;context", (.gogoproto.customtype) = "JSONStringOrStrings"];</code>
   * @return Whether the contexts field is set.
   */
  boolean hasContexts();
  /**
   * <code>.panacea.did.v2.Strings contexts = 1 [json_name = "&#64;context", (.gogoproto.customtype) = "JSONStringOrStrings"];</code>
   * @return The contexts.
   */
  panacea.did.v2.Strings getContexts();
  /**
   * <code>.panacea.did.v2.Strings contexts = 1 [json_name = "&#64;context", (.gogoproto.customtype) = "JSONStringOrStrings"];</code>
   */
  panacea.did.v2.StringsOrBuilder getContextsOrBuilder();

  /**
   * <code>string id = 2;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 2;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.panacea.did.v2.Strings controller = 3 [(.gogoproto.customtype) = "JSONStringOrStrings"];</code>
   * @return Whether the controller field is set.
   */
  boolean hasController();
  /**
   * <code>.panacea.did.v2.Strings controller = 3 [(.gogoproto.customtype) = "JSONStringOrStrings"];</code>
   * @return The controller.
   */
  panacea.did.v2.Strings getController();
  /**
   * <code>.panacea.did.v2.Strings controller = 3 [(.gogoproto.customtype) = "JSONStringOrStrings"];</code>
   */
  panacea.did.v2.StringsOrBuilder getControllerOrBuilder();

  /**
   * <code>repeated .panacea.did.v2.VerificationMethod verification_methods = 4 [json_name = "verificationMethod"];</code>
   */
  java.util.List<panacea.did.v2.VerificationMethod> 
      getVerificationMethodsList();
  /**
   * <code>repeated .panacea.did.v2.VerificationMethod verification_methods = 4 [json_name = "verificationMethod"];</code>
   */
  panacea.did.v2.VerificationMethod getVerificationMethods(int index);
  /**
   * <code>repeated .panacea.did.v2.VerificationMethod verification_methods = 4 [json_name = "verificationMethod"];</code>
   */
  int getVerificationMethodsCount();
  /**
   * <code>repeated .panacea.did.v2.VerificationMethod verification_methods = 4 [json_name = "verificationMethod"];</code>
   */
  java.util.List<? extends panacea.did.v2.VerificationMethodOrBuilder> 
      getVerificationMethodsOrBuilderList();
  /**
   * <code>repeated .panacea.did.v2.VerificationMethod verification_methods = 4 [json_name = "verificationMethod"];</code>
   */
  panacea.did.v2.VerificationMethodOrBuilder getVerificationMethodsOrBuilder(
      int index);

  /**
   * <pre>
   * TODO: the repeated gogoproto.customtype has an issue: https://github.com/gogo/protobuf/issues/478
   * </pre>
   *
   * <code>repeated .panacea.did.v2.VerificationRelationship authentications = 5 [json_name = "authentication", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  java.util.List<panacea.did.v2.VerificationRelationship> 
      getAuthenticationsList();
  /**
   * <pre>
   * TODO: the repeated gogoproto.customtype has an issue: https://github.com/gogo/protobuf/issues/478
   * </pre>
   *
   * <code>repeated .panacea.did.v2.VerificationRelationship authentications = 5 [json_name = "authentication", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  panacea.did.v2.VerificationRelationship getAuthentications(int index);
  /**
   * <pre>
   * TODO: the repeated gogoproto.customtype has an issue: https://github.com/gogo/protobuf/issues/478
   * </pre>
   *
   * <code>repeated .panacea.did.v2.VerificationRelationship authentications = 5 [json_name = "authentication", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  int getAuthenticationsCount();
  /**
   * <pre>
   * TODO: the repeated gogoproto.customtype has an issue: https://github.com/gogo/protobuf/issues/478
   * </pre>
   *
   * <code>repeated .panacea.did.v2.VerificationRelationship authentications = 5 [json_name = "authentication", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  java.util.List<? extends panacea.did.v2.VerificationRelationshipOrBuilder> 
      getAuthenticationsOrBuilderList();
  /**
   * <pre>
   * TODO: the repeated gogoproto.customtype has an issue: https://github.com/gogo/protobuf/issues/478
   * </pre>
   *
   * <code>repeated .panacea.did.v2.VerificationRelationship authentications = 5 [json_name = "authentication", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  panacea.did.v2.VerificationRelationshipOrBuilder getAuthenticationsOrBuilder(
      int index);

  /**
   * <code>repeated .panacea.did.v2.VerificationRelationship assertion_methods = 6 [json_name = "assertionMethod", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  java.util.List<panacea.did.v2.VerificationRelationship> 
      getAssertionMethodsList();
  /**
   * <code>repeated .panacea.did.v2.VerificationRelationship assertion_methods = 6 [json_name = "assertionMethod", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  panacea.did.v2.VerificationRelationship getAssertionMethods(int index);
  /**
   * <code>repeated .panacea.did.v2.VerificationRelationship assertion_methods = 6 [json_name = "assertionMethod", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  int getAssertionMethodsCount();
  /**
   * <code>repeated .panacea.did.v2.VerificationRelationship assertion_methods = 6 [json_name = "assertionMethod", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  java.util.List<? extends panacea.did.v2.VerificationRelationshipOrBuilder> 
      getAssertionMethodsOrBuilderList();
  /**
   * <code>repeated .panacea.did.v2.VerificationRelationship assertion_methods = 6 [json_name = "assertionMethod", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  panacea.did.v2.VerificationRelationshipOrBuilder getAssertionMethodsOrBuilder(
      int index);

  /**
   * <code>repeated .panacea.did.v2.VerificationRelationship key_agreements = 7 [json_name = "keyAgreement", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  java.util.List<panacea.did.v2.VerificationRelationship> 
      getKeyAgreementsList();
  /**
   * <code>repeated .panacea.did.v2.VerificationRelationship key_agreements = 7 [json_name = "keyAgreement", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  panacea.did.v2.VerificationRelationship getKeyAgreements(int index);
  /**
   * <code>repeated .panacea.did.v2.VerificationRelationship key_agreements = 7 [json_name = "keyAgreement", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  int getKeyAgreementsCount();
  /**
   * <code>repeated .panacea.did.v2.VerificationRelationship key_agreements = 7 [json_name = "keyAgreement", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  java.util.List<? extends panacea.did.v2.VerificationRelationshipOrBuilder> 
      getKeyAgreementsOrBuilderList();
  /**
   * <code>repeated .panacea.did.v2.VerificationRelationship key_agreements = 7 [json_name = "keyAgreement", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  panacea.did.v2.VerificationRelationshipOrBuilder getKeyAgreementsOrBuilder(
      int index);

  /**
   * <code>repeated .panacea.did.v2.VerificationRelationship capability_invocations = 8 [json_name = "capabilityInvocation", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  java.util.List<panacea.did.v2.VerificationRelationship> 
      getCapabilityInvocationsList();
  /**
   * <code>repeated .panacea.did.v2.VerificationRelationship capability_invocations = 8 [json_name = "capabilityInvocation", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  panacea.did.v2.VerificationRelationship getCapabilityInvocations(int index);
  /**
   * <code>repeated .panacea.did.v2.VerificationRelationship capability_invocations = 8 [json_name = "capabilityInvocation", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  int getCapabilityInvocationsCount();
  /**
   * <code>repeated .panacea.did.v2.VerificationRelationship capability_invocations = 8 [json_name = "capabilityInvocation", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  java.util.List<? extends panacea.did.v2.VerificationRelationshipOrBuilder> 
      getCapabilityInvocationsOrBuilderList();
  /**
   * <code>repeated .panacea.did.v2.VerificationRelationship capability_invocations = 8 [json_name = "capabilityInvocation", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  panacea.did.v2.VerificationRelationshipOrBuilder getCapabilityInvocationsOrBuilder(
      int index);

  /**
   * <code>repeated .panacea.did.v2.VerificationRelationship capability_delegations = 9 [json_name = "capabilityDelegation", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  java.util.List<panacea.did.v2.VerificationRelationship> 
      getCapabilityDelegationsList();
  /**
   * <code>repeated .panacea.did.v2.VerificationRelationship capability_delegations = 9 [json_name = "capabilityDelegation", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  panacea.did.v2.VerificationRelationship getCapabilityDelegations(int index);
  /**
   * <code>repeated .panacea.did.v2.VerificationRelationship capability_delegations = 9 [json_name = "capabilityDelegation", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  int getCapabilityDelegationsCount();
  /**
   * <code>repeated .panacea.did.v2.VerificationRelationship capability_delegations = 9 [json_name = "capabilityDelegation", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  java.util.List<? extends panacea.did.v2.VerificationRelationshipOrBuilder> 
      getCapabilityDelegationsOrBuilderList();
  /**
   * <code>repeated .panacea.did.v2.VerificationRelationship capability_delegations = 9 [json_name = "capabilityDelegation", (.gogoproto.customtype) = "VerificationRelationship"];</code>
   */
  panacea.did.v2.VerificationRelationshipOrBuilder getCapabilityDelegationsOrBuilder(
      int index);

  /**
   * <code>repeated .panacea.did.v2.Service services = 10 [json_name = "service"];</code>
   */
  java.util.List<panacea.did.v2.Service> 
      getServicesList();
  /**
   * <code>repeated .panacea.did.v2.Service services = 10 [json_name = "service"];</code>
   */
  panacea.did.v2.Service getServices(int index);
  /**
   * <code>repeated .panacea.did.v2.Service services = 10 [json_name = "service"];</code>
   */
  int getServicesCount();
  /**
   * <code>repeated .panacea.did.v2.Service services = 10 [json_name = "service"];</code>
   */
  java.util.List<? extends panacea.did.v2.ServiceOrBuilder> 
      getServicesOrBuilderList();
  /**
   * <code>repeated .panacea.did.v2.Service services = 10 [json_name = "service"];</code>
   */
  panacea.did.v2.ServiceOrBuilder getServicesOrBuilder(
      int index);
}
