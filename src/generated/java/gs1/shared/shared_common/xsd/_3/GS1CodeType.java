
package gs1.shared.shared_common.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import gs1.gdsn.alcohol_information.xsd._3.AlcoholBeverageDistilledFromCodeType;
import gs1.gdsn.alcohol_information.xsd._3.AlcoholBeverageFilteringMethodTypeCodeType;
import gs1.gdsn.alcohol_information.xsd._3.AlcoholBeverageProductionMethodTypeCodeType;
import gs1.gdsn.alcohol_information.xsd._3.AlcoholBeverageTypeCodeType;
import gs1.gdsn.alcohol_information.xsd._3.AlcoholicBeverageColourCodeType;
import gs1.gdsn.alcohol_information.xsd._3.BeerStyleTypeCodeType;
import gs1.gdsn.alcohol_information.xsd._3.ContainerMaterialCodeType;
import gs1.gdsn.alcohol_information.xsd._3.ContainerProcessTypeCodeType;
import gs1.gdsn.alcohol_information.xsd._3.ContainerShapeCodeType;
import gs1.gdsn.alcohol_information.xsd._3.ContainerTypeCodeType;
import gs1.gdsn.alcohol_information.xsd._3.OriginOfWineCodeType;
import gs1.gdsn.alcohol_information.xsd._3.PrimaryAddedFlavouringCodeType;
import gs1.gdsn.alcohol_information.xsd._3.SecondaryAddedFlavouringCodeType;
import gs1.gdsn.alcohol_information.xsd._3.SweetnessLevelOfAlcoholicBeverageCodeType;
import gs1.gdsn.allergen_information.xsd._3.AllergenTypeCodeType;
import gs1.gdsn.animal_feeding.xsd._3.AnimalFoodProcessOrStateTypeCodeType;
import gs1.gdsn.animal_feeding.xsd._3.AnimalFoodTypeCodeType;
import gs1.gdsn.animal_feeding.xsd._3.AnimalTargetSizeCodeType;
import gs1.gdsn.animal_feeding.xsd._3.AnimalTargetedHealthConditionCodeType;
import gs1.gdsn.animal_feeding.xsd._3.FeedLifestageCodeType;
import gs1.gdsn.animal_feeding.xsd._3.FeedTypeCodeType;
import gs1.gdsn.animal_feeding.xsd._3.TargetedConsumptionByCodeType;
import gs1.gdsn.apparel_information.xsd._3.ClosureOrFastenerTypeCodeType;
import gs1.gdsn.apparel_information.xsd._3.HangerStandardAgencyCodeType;
import gs1.gdsn.audio_visual_media_content_information.xsd._3.AudioVisualMediaContributorTypeCodeType;
import gs1.gdsn.audio_visual_media_content_information.xsd._3.ClosedCaptioningCodeType;
import gs1.gdsn.audio_visual_media_content_information.xsd._3.DVDRegionCodeType;
import gs1.gdsn.audio_visual_media_content_information.xsd._3.DistributionMediaTypeCodeType;
import gs1.gdsn.audio_visual_media_content_information.xsd._3.DubbedSubtitledCodeType;
import gs1.gdsn.audio_visual_media_content_information.xsd._3.GameFormatCodeType;
import gs1.gdsn.audio_visual_media_product_description_information.xsd._3.AudioVisualMediaDateTypeCodeType;
import gs1.gdsn.audio_visual_media_production_information.xsd._3.AudioSoundTypeCodeType;
import gs1.gdsn.audio_visual_media_production_information.xsd._3.DigitalisationLevelTypeCodeType;
import gs1.gdsn.audio_visual_media_production_information.xsd._3.VisualMediaColourCodeType;
import gs1.gdsn.battery_information.xsd._3.BatteryTechnologyTypeCodeType;
import gs1.gdsn.battery_information.xsd._3.BatteryTypeCodeType;
import gs1.gdsn.battery_information.xsd._3.BatteryTypeQualifierCodeType;
import gs1.gdsn.battery_information.xsd._3.PowerSupplyTypeCodeType;
import gs1.gdsn.chemical_regulation_information.xsd._3.CarcinogenicMutagenicReprotoxicTypeCodeType;
import gs1.gdsn.chemical_regulation_information.xsd._3.ChemicalPhysicalStateCodeType;
import gs1.gdsn.chemical_regulation_information.xsd._3.ChemicalPropertyTypeCodeType;
import gs1.gdsn.chemical_regulation_information.xsd._3.RegulatedChemicalTypeCodeType;
import gs1.gdsn.child_nutrition_information.xsd._3.ChildNutritionQualifierCodeType;
import gs1.gdsn.consumer_instructions.xsd._3.DexterityUsageCodeType;
import gs1.gdsn.consumer_instructions.xsd._3.ProductUsageBodyLocationCodeType;
import gs1.gdsn.consumer_instructions.xsd._3.RequiredEducationTrainingTypeCodeType;
import gs1.gdsn.consumer_instructions.xsd._3.TypeOfCleaningCodeType;
import gs1.gdsn.consumer_instructions.xsd._3.TypeOfCleaningDisinfectionProcessCodeType;
import gs1.gdsn.consumer_instructions.xsd._3.TypeOfDisinfectionCodeType;
import gs1.gdsn.dairy_fish_meat_poultry.xsd._3.CatchAreaCodeGDSNType;
import gs1.gdsn.dairy_fish_meat_poultry.xsd._3.CatchMethodCodeType;
import gs1.gdsn.dairy_fish_meat_poultry.xsd._3.CheeseMaturationProcessContainerTypeCodeType;
import gs1.gdsn.dairy_fish_meat_poultry.xsd._3.CheeseMilkAcquisitionTypeCodeType;
import gs1.gdsn.dairy_fish_meat_poultry.xsd._3.CheeseRipeningProcessCodeType;
import gs1.gdsn.dairy_fish_meat_poultry.xsd._3.CheeseTypeCodeType;
import gs1.gdsn.dairy_fish_meat_poultry.xsd._3.DateOfCatchProcessTypeCodeType;
import gs1.gdsn.dairy_fish_meat_poultry.xsd._3.FirmnessOfCheeseCodeType;
import gs1.gdsn.dairy_fish_meat_poultry.xsd._3.FishSeafoodPresentationCodeType;
import gs1.gdsn.dairy_fish_meat_poultry.xsd._3.ProductionMethodForFishAndSeafoodCodeType;
import gs1.gdsn.dairy_fish_meat_poultry.xsd._3.RennetTypeCodeType;
import gs1.gdsn.dairy_fish_meat_poultry.xsd._3.SaltMoistureContentCodeType;
import gs1.gdsn.dairy_fish_meat_poultry.xsd._3.StorageStateCodeType;
import gs1.gdsn.dairy_fish_meat_poultry.xsd._3.SurfaceOfCheeseAtEndOfRipeningCodeType;
import gs1.gdsn.dangerous_substance_information.xsd._3.DangerousSubstancesWaterSolubilityCodeType;
import gs1.gdsn.delivery_purchasing_information.xsd._3.DeliveryFrequencyCodeType;
import gs1.gdsn.delivery_purchasing_information.xsd._3.OrderableReturnableConditionsCodeType;
import gs1.gdsn.delivery_purchasing_information.xsd._3.RightOfReturnForNonSoldTradeItemCodeType;
import gs1.gdsn.diet_information.xsd._3.DietTypeCodeType;
import gs1.gdsn.electronic_device_characteristics_information.xsd._3.AudioVisualConnectionInputDirectionCodeType;
import gs1.gdsn.electronic_device_characteristics_information.xsd._3.AudioVisualConnectionLocationCodeType;
import gs1.gdsn.electronic_device_characteristics_information.xsd._3.AudioVisualConnectionTypeCodeType;
import gs1.gdsn.electronic_device_characteristics_information.xsd._3.DetachableSpeakerTypeCodeType;
import gs1.gdsn.electronic_device_characteristics_information.xsd._3.ExternalMemoryTypeCodeType;
import gs1.gdsn.electronic_device_characteristics_information.xsd._3.FixedSpeakerLocationCodeType;
import gs1.gdsn.electronic_device_characteristics_information.xsd._3.HDMIFeatureCodeType;
import gs1.gdsn.electronic_device_characteristics_information.xsd._3.HDMITestingAgencyCodeType;
import gs1.gdsn.electronic_device_characteristics_information.xsd._3.InternalMemoryTypeCodeType;
import gs1.gdsn.electronic_device_characteristics_information.xsd._3.MicrophoneTypeCodeType;
import gs1.gdsn.electronic_device_characteristics_information.xsd._3.RemoteControlTypeCodeType;
import gs1.gdsn.electronic_device_characteristics_information.xsd._3.ResolutionTypeCodeType;
import gs1.gdsn.electronic_device_characteristics_information.xsd._3.SignalProcessingTypeCodeType;
import gs1.gdsn.electronic_device_characteristics_information.xsd._3.SurroundSoundDigitalDecoderTypeCodeType;
import gs1.gdsn.electronic_device_characteristics_information.xsd._3.TunerTypeCodeType;
import gs1.gdsn.food_and_beverage_ingredient.xsd._3.GrapeVarietyCodeType;
import gs1.gdsn.food_and_beverage_ingredient.xsd._3.IngredientOfConcernCodeType;
import gs1.gdsn.food_and_beverage_preparation_serving.xsd._3.ProductTextureAgencyCodeType;
import gs1.gdsn.food_and_beverage_preparation_serving.xsd._3.ProductTextureCodeType;
import gs1.gdsn.food_and_beverage_preparation_serving.xsd._3.ProductYieldTypeCodeType;
import gs1.gdsn.food_and_beverage_properties_information.xsd._3.MicrobiologicalOrganismCodeType;
import gs1.gdsn.food_and_beverage_properties_information.xsd._3.MicrobiologicalOrganismMethodOfAnalysisCodeType;
import gs1.gdsn.food_and_beverage_properties_information.xsd._3.PhysiochemicalCharacteristicCodeType;
import gs1.gdsn.gdsn_common.xsd._3.AdditionalTradeItemClassificationCodeListCodeType;
import gs1.gdsn.gdsn_common.xsd._3.AspectRatioDescriptionCodeType;
import gs1.gdsn.gdsn_common.xsd._3.AspectRatioDimensionCodeType;
import gs1.gdsn.gdsn_common.xsd._3.BioengineeredDeclarationClaimCodeType;
import gs1.gdsn.gdsn_common.xsd._3.CatalogueItemConfirmationStatusCodeType;
import gs1.gdsn.gdsn_common.xsd._3.ConfirmationStatusReasonCodeType;
import gs1.gdsn.gdsn_common.xsd._3.CorrectiveActionCodeType;
import gs1.gdsn.gdsn_common.xsd._3.CriteriaJoinTypeCodeType;
import gs1.gdsn.gdsn_common.xsd._3.CriteriaOperatorTypeCodeType;
import gs1.gdsn.gdsn_common.xsd._3.DangerousGoodsTransportCategoryCodeType;
import gs1.gdsn.gdsn_common.xsd._3.DimensionTypeCodeType;
import gs1.gdsn.gdsn_common.xsd._3.DisplayTypeCodeType;
import gs1.gdsn.gdsn_common.xsd._3.DistributionMethodCodeType;
import gs1.gdsn.gdsn_common.xsd._3.ExceptionMessageTypeCodeType;
import gs1.gdsn.gdsn_common.xsd._3.GrowingMethodCodeType;
import gs1.gdsn.gdsn_common.xsd._3.HierarchyDeletionReasonCodeType;
import gs1.gdsn.gdsn_common.xsd._3.ImageFacingCodeType;
import gs1.gdsn.gdsn_common.xsd._3.ImageOrientationTypeCodeType;
import gs1.gdsn.gdsn_common.xsd._3.ImageStateCodeType;
import gs1.gdsn.gdsn_common.xsd._3.IsReloadReasonCodeType;
import gs1.gdsn.gdsn_common.xsd._3.LevelOfContainmentCodeType;
import gs1.gdsn.gdsn_common.xsd._3.MaterialAgencyCodeType;
import gs1.gdsn.gdsn_common.xsd._3.MaturationMethodCodeType;
import gs1.gdsn.gdsn_common.xsd._3.MeasurementPrecisionCodeType;
import gs1.gdsn.gdsn_common.xsd._3.NutritionAgencyCodeType;
import gs1.gdsn.gdsn_common.xsd._3.OrganicClaimAgencyCodeType;
import gs1.gdsn.gdsn_common.xsd._3.OrganicClaimAgencyTypeCodeType;
import gs1.gdsn.gdsn_common.xsd._3.OrganicProductPlaceOfFarmingCodeType;
import gs1.gdsn.gdsn_common.xsd._3.OrganicTradeItemCodeType;
import gs1.gdsn.gdsn_common.xsd._3.PackagingMaterialTypeCodeType;
import gs1.gdsn.gdsn_common.xsd._3.PhaseOfMatterCodeType;
import gs1.gdsn.gdsn_common.xsd._3.PostHarvestTreatmentChemicalCodeType;
import gs1.gdsn.gdsn_common.xsd._3.PostProcessTradeItemTreatmentPhysicalCodeType;
import gs1.gdsn.gdsn_common.xsd._3.PreliminaryItemStatusCodeType;
import gs1.gdsn.gdsn_common.xsd._3.PreparationTypeCodeType;
import gs1.gdsn.gdsn_common.xsd._3.PreservationTechniqueTypeCodeType;
import gs1.gdsn.gdsn_common.xsd._3.ProductActivityTypeCodeType;
import gs1.gdsn.gdsn_common.xsd._3.ReferencedFileTypeCodeType;
import gs1.gdsn.gdsn_common.xsd._3.ReferencedTradeItemTypeCodeType;
import gs1.gdsn.gdsn_common.xsd._3.RegistryCatalogueItemStateCodeType;
import gs1.gdsn.gdsn_common.xsd._3.SourceAnimalCodeType;
import gs1.gdsn.gdsn_common.xsd._3.SustainabilityFeatureCodeType;
import gs1.gdsn.gdsn_common.xsd._3.TemperatureQualifierCodeType;
import gs1.gdsn.gdsn_common.xsd._3.TradeChannelCodeType;
import gs1.gdsn.gdsn_common.xsd._3.TradeItemContextCodeType;
import gs1.gdsn.gdsn_common.xsd._3.TradeItemUnitDescriptorCodeType;
import gs1.gdsn.gdsn_common.xsd._3.TransactionalMeasurementUnitCodeType;
import gs1.gdsn.health_related_information.xsd._3.CannabisCBDTypeCodeType;
import gs1.gdsn.health_related_information.xsd._3.CompulsoryAdditionalLabelInformationTypeCodeType;
import gs1.gdsn.health_related_information.xsd._3.NutritionalLabelTypeCodeType;
import gs1.gdsn.health_related_information.xsd._3.NutritionalProgramCodeType;
import gs1.gdsn.health_related_information.xsd._3.NutritionalProgramIngredientTypeCodeType;
import gs1.gdsn.health_related_information.xsd._3.NutritionalProgramStatusCodeType;
import gs1.gdsn.health_wellness_packaging_marking.xsd._3.PackagingMarkedNutritionLabelCodeType;
import gs1.gdsn.healthcare_item_information.xsd._3.AllowedUsageCodeType;
import gs1.gdsn.healthcare_item_information.xsd._3.ClinicalSizeMeasurementPrecisionCodeType;
import gs1.gdsn.healthcare_item_information.xsd._3.ClinicalSizeTypeCodeType;
import gs1.gdsn.healthcare_item_information.xsd._3.ClinicalStorageHandlingTypeCodeType;
import gs1.gdsn.healthcare_item_information.xsd._3.ClinicalWarningAgencyCodeType;
import gs1.gdsn.healthcare_item_information.xsd._3.HealthcareGroupedProductCodeType;
import gs1.gdsn.healthcare_item_information.xsd._3.PrescriptionTypeCodeType;
import gs1.gdsn.lighting_device.xsd._3.LightBeamTypeCodeType;
import gs1.gdsn.lighting_device.xsd._3.LightBulbFilamentTypeCodeType;
import gs1.gdsn.lighting_device.xsd._3.LightBulbLampTypeCodeType;
import gs1.gdsn.lighting_device.xsd._3.LightBulbShapeCodeType;
import gs1.gdsn.marketing_information.xsd._3.SeasonParameterCodeType;
import gs1.gdsn.marketing_information.xsd._3.SpecialItemCodeType;
import gs1.gdsn.marketing_information.xsd._3.StrongnessOfBasicTasteCodeType;
import gs1.gdsn.marketing_information.xsd._3.TargetConsumerAgeGroupCodeType;
import gs1.gdsn.marketing_information.xsd._3.TargetConsumerGenderCodeType;
import gs1.gdsn.marketing_information.xsd._3.TargetConsumerUsageTypeCodeType;
import gs1.gdsn.marketing_information.xsd._3.TypeOfBasicTasteCodeType;
import gs1.gdsn.medical_device_trade_item.xsd._3.AnnexXVIIntendedPurposeTypeCodeType;
import gs1.gdsn.medical_device_trade_item.xsd._3.EUMedicalDeviceStatusCodeType;
import gs1.gdsn.medical_device_trade_item.xsd._3.EUMedicalDeviceSubStatusCodeType;
import gs1.gdsn.medical_device_trade_item.xsd._3.HealthcareTradeItemReusabilityTypeCodeType;
import gs1.gdsn.medical_device_trade_item.xsd._3.MRICompatibilityCodeType;
import gs1.gdsn.medical_device_trade_item.xsd._3.MultiComponentDeviceTypeCodeType;
import gs1.gdsn.medical_device_trade_item.xsd._3.RecallScopeTypeCodeType;
import gs1.gdsn.medical_device_trade_item.xsd._3.SpecialDeviceTypeCodeType;
import gs1.gdsn.medical_device_trade_item.xsd._3.SterilisationTypeCodeType;
import gs1.gdsn.medical_device_trade_item.xsd._3.SystemOrProcedurePackTypeCodeType;
import gs1.gdsn.medical_device_trade_item.xsd._3.UDIProductionIdentifierTypeCodeType;
import gs1.gdsn.nonfood_ingredient.xsd._3.NonfoodIngredientOfConcernCodeType;
import gs1.gdsn.nutritional_information.xsd._3.FoodBeverageCompositionDatabaseCodeType;
import gs1.gdsn.nutritional_information.xsd._3.NutrientBasisQuantityTypeCodeType;
import gs1.gdsn.nutritional_information.xsd._3.NutrientValueDerivationCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXAudienceCodeValueCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXAudiencePrecisionCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXAudienceRangeQualifierCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXAudienceTypeCodeListCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXContentDateRoleTypeCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXContributorPlaceTypeCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXContributorRoleCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXEditionTypeCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXEpubTechnicalProtectionTypeCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXExtentTypeCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXExtentUnitTypeCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXIllustrationTypeCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXNameTypeCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXProductAvailabilityCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXPublicationDateTypeCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXPublicationDescriptionTypeCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXPublisherRoleTypeCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXSalesRightsTypeCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXSeriesIdentifierTypeCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXSubjectSchemeIdentifierCodeType;
import gs1.gdsn.onix_publication_file_information.xsd._3.ONIXTitleTypeCodeType;
import gs1.gdsn.optics_device_information.xsd._3.ZoomTypeCodeType;
import gs1.gdsn.packaging_information.xsd._3.AverageDistanceToPointOfPackagingCodeType;
import gs1.gdsn.packaging_information.xsd._3.PackageTypeCodeType;
import gs1.gdsn.packaging_information.xsd._3.PackagingFeatureCodeType;
import gs1.gdsn.packaging_information.xsd._3.PackagingFunctionCodeType;
import gs1.gdsn.packaging_information.xsd._3.PackagingLabellingTypeCodeType;
import gs1.gdsn.packaging_information.xsd._3.PackagingMaterialAppliedProcessCodeType;
import gs1.gdsn.packaging_information.xsd._3.PackagingMaterialElementCodeType;
import gs1.gdsn.packaging_information.xsd._3.PackagingMaterialPerformanceCodeType;
import gs1.gdsn.packaging_information.xsd._3.PackagingRawMaterialCodeType;
import gs1.gdsn.packaging_information.xsd._3.PackagingRecyclabilityAssessmentSpecificationCodeType;
import gs1.gdsn.packaging_information.xsd._3.PackagingRecyclingProcessTypeCodeType;
import gs1.gdsn.packaging_information.xsd._3.PackagingRecyclingSchemeCodeType;
import gs1.gdsn.packaging_information.xsd._3.PackagingShapeCodeType;
import gs1.gdsn.packaging_information.xsd._3.PackagingTermsAndConditionsCodeType;
import gs1.gdsn.packaging_information.xsd._3.PlatformTermsAndConditionsCodeType;
import gs1.gdsn.packaging_information.xsd._3.PlatformTypeCodeType;
import gs1.gdsn.packaging_information.xsd._3.ShippingContainerTypeCodeType;
import gs1.gdsn.packaging_marking.xsd._3.ConsumerWarningTypeCodeType;
import gs1.gdsn.packaging_marking.xsd._3.DateOnPackagingFormatTypeCodeType;
import gs1.gdsn.packaging_marking.xsd._3.PackagingMarkedLabelAccreditationCodeType;
import gs1.gdsn.packaging_marking.xsd._3.SerialNumberLocationCodeType;
import gs1.gdsn.packaging_marking.xsd._3.TradeItemDateOnPackagingTypeCodeType;
import gs1.gdsn.packaging_marking.xsd._3.TradeItemIdentificationMarkingTypeCodeType;
import gs1.gdsn.packaging_marking.xsd._3.TypeOfProductChangesAfterDateCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.AcidificationMeasurementProtocolCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.AcidificationMeasurementReferenceSubstanceCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.AquaticEutrophicationModelCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.AquaticEutrophicationReferenceSubstanceCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.AquaticEutrophicationWaterBodyTypeCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.CumulativeEnergyDemandProtocolCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.CumulativeEnergyDemandReferenceSubstanceCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.CumulativeEnergyDemandTypeCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.FreshWaterEcotoxicityModelCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.FreshWaterEcotoxicityReferenceSubstanceCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.FunctionalBasisUnitCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.GlobalWarmingPotentialEquivalentBasisYearsCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.GlobalWarmingPotentialEquivalentProtocolCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.GlobalWarmingPotentialEquivalentSubstanceCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.HazardousSubstancesMinimizationCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.MassEquivalentCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.MassEquivalentProtocolCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.PackagingChainOfCustodySourceCertifiedCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.PackagingLevelTypeCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.PackagingRecoveryRateTypeCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.PackagingRecycledContentTypeCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.PackagingRenewableContentTypeCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.PackagingReusabilityStandardCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.ProofOfOptimizedPackagingWeightStandardCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.ProofOfPackagingWeightReductionStandardCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.SourceCertificationSystemProtocolCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.TotalPackagingEconomicCostMeasurementCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.ToxicityMeasurementProtocolCodeType;
import gs1.gdsn.packaging_sustainability.xsd._3.ToxicityReferenceSubstanceCodeType;
import gs1.gdsn.physical_resource_usage.xsd._3.PhysicalResourceTypeCodeType;
import gs1.gdsn.physical_resource_usage.xsd._3.PhysicalResourceUsageMeasurementTypeCodeType;
import gs1.gdsn.physical_resource_usage.xsd._3.RunModeCodeType;
import gs1.gdsn.place_of_item_activity.xsd._3.ImportClassificationTypeCodeType;
import gs1.gdsn.plumbing_hvac_pipe_information.xsd._3.BendAngleCodeType;
import gs1.gdsn.plumbing_hvac_pipe_information.xsd._3.MeshMaterialCodeType;
import gs1.gdsn.plumbing_hvac_pipe_information.xsd._3.MeshSizeCodeType;
import gs1.gdsn.plumbing_hvac_pipe_information.xsd._3.PlumbingControlTypeCodeType;
import gs1.gdsn.plumbing_hvac_pipe_information.xsd._3.PlumbingHVACConnectionAgencyCodeType;
import gs1.gdsn.plumbing_hvac_pipe_information.xsd._3.PlumbingHVACConnectionTypeCodeType;
import gs1.gdsn.plumbing_hvac_pipe_information.xsd._3.ThreadTypeCodeType;
import gs1.gdsn.plumbing_hvac_pipe_information.xsd._3.WorkingPressureRatingClassCodeType;
import gs1.gdsn.product_characteristics.xsd._3.ProductCharacteristicCodeType;
import gs1.gdsn.product_formulation_statement.xsd._3.CreditableIngredientTypeCodeType;
import gs1.gdsn.product_formulation_statement.xsd._3.VegetableSubgroupCodeType;
import gs1.gdsn.product_information.xsd._3.ApparelDetailApplicationCodeType;
import gs1.gdsn.product_information.xsd._3.ApparelDetailPlacementCodeType;
import gs1.gdsn.product_information.xsd._3.ApparelDetailSizeCodeType;
import gs1.gdsn.product_information.xsd._3.ApparelDetailTypeCodeType;
import gs1.gdsn.product_information.xsd._3.BrushBroomTypeCodeType;
import gs1.gdsn.product_information.xsd._3.ClaimElementCodeType;
import gs1.gdsn.product_information.xsd._3.ClaimTypeCodeType;
import gs1.gdsn.product_information.xsd._3.CleaningClothTypeCodeType;
import gs1.gdsn.product_information.xsd._3.DentalProductFunctionCodeType;
import gs1.gdsn.product_information.xsd._3.DispenserTypeCodeType;
import gs1.gdsn.product_information.xsd._3.FootwearOutsoleTypeCodeType;
import gs1.gdsn.product_information.xsd._3.FootwearStyleCodeType;
import gs1.gdsn.product_information.xsd._3.FormationTypeCodeType;
import gs1.gdsn.product_information.xsd._3.GarmentAdornmentTypeCodeType;
import gs1.gdsn.product_information.xsd._3.GarmentLegTypeCodeType;
import gs1.gdsn.product_information.xsd._3.GarmentLengthTypeCodeType;
import gs1.gdsn.product_information.xsd._3.GarmentLinedCodeType;
import gs1.gdsn.product_information.xsd._3.HairProductFunctionOrTreatmentCodeType;
import gs1.gdsn.product_information.xsd._3.HatTypeCodeType;
import gs1.gdsn.product_information.xsd._3.HeelStyleCodeType;
import gs1.gdsn.product_information.xsd._3.HosierySockRiseCodeType;
import gs1.gdsn.product_information.xsd._3.HosierySockStyleCodeType;
import gs1.gdsn.product_information.xsd._3.HouseholdCleaningProductTypeCodeType;
import gs1.gdsn.product_information.xsd._3.JewelrySetContentsCodeType;
import gs1.gdsn.product_information.xsd._3.JewelryStyleCodeType;
import gs1.gdsn.product_information.xsd._3.LaundryDetergentTypeCodeType;
import gs1.gdsn.product_information.xsd._3.LaundryHangingAidTypeCodeType;
import gs1.gdsn.product_information.xsd._3.NaturalHairColourCodeType;
import gs1.gdsn.product_information.xsd._3.NecklaceTypeCodeType;
import gs1.gdsn.product_information.xsd._3.NeckwearTypeCodeType;
import gs1.gdsn.product_information.xsd._3.PantsShortsTypeCodeType;
import gs1.gdsn.product_information.xsd._3.PerfumeFragranceDilutionClassCodeType;
import gs1.gdsn.product_information.xsd._3.PillowShapeCodeType;
import gs1.gdsn.product_information.xsd._3.RingTypeCodeType;
import gs1.gdsn.product_information.xsd._3.RugTypeCodeType;
import gs1.gdsn.product_information.xsd._3.SeamsCodeType;
import gs1.gdsn.product_information.xsd._3.SkinProductFunctionOrTreatmentCodeType;
import gs1.gdsn.product_information.xsd._3.SkirtTypeCodeType;
import gs1.gdsn.product_information.xsd._3.SpongeScourerTypeCodeType;
import gs1.gdsn.product_information.xsd._3.SportCodeType;
import gs1.gdsn.product_information.xsd._3.SweaterPulloverTypeCodeType;
import gs1.gdsn.product_information.xsd._3.TablewareTypeCodeType;
import gs1.gdsn.product_information.xsd._3.TargetHairTypeCodeType;
import gs1.gdsn.product_information.xsd._3.TargetSkinTypeCodeType;
import gs1.gdsn.product_information.xsd._3.TargetSurfaceTypeCodeType;
import gs1.gdsn.product_information.xsd._3.TimeOfApplicationCodeType;
import gs1.gdsn.product_information.xsd._3.ToeStyleTypeCodeType;
import gs1.gdsn.product_information.xsd._3.TowelTypeCodeType;
import gs1.gdsn.product_information.xsd._3.WaistRiseCodeType;
import gs1.gdsn.product_information.xsd._3.WaistbandTypeCodeType;
import gs1.gdsn.product_information.xsd._3.WatchCaseShapeCodeType;
import gs1.gdsn.promotional_item_information.xsd._3.PromotionTypeCodeType;
import gs1.gdsn.propellant_information.xsd._3.FlammableAerosolContainmentCodeType;
import gs1.gdsn.publication_title_rating.xsd._3.RatingContentDescriptorCodeType;
import gs1.gdsn.referenced_file_detail_information.xsd._3.AdditionalCameraAngleCodeType;
import gs1.gdsn.referenced_file_detail_information.xsd._3.FileCameraPerspectiveCodeType;
import gs1.gdsn.referenced_file_detail_information.xsd._3.FileColourSchemeCodeType;
import gs1.gdsn.referenced_file_detail_information.xsd._3.ItemDepictionCodeType;
import gs1.gdsn.referenced_file_detail_information.xsd._3.ItemPositionCodeType;
import gs1.gdsn.referenced_file_detail_information.xsd._3.VerticalCameraAngleCodeType;
import gs1.gdsn.regulated_trade_item.xsd._3.RegulationCommunityLevelCodeType;
import gs1.gdsn.regulated_trade_item.xsd._3.RegulationTypeCodeType;
import gs1.gdsn.regulated_trade_item.xsd._3.RegulatoryActComplianceLevelCodeType;
import gs1.gdsn.safety_data_sheet.xsd._3.FlashPointTestMethodCodeType;
import gs1.gdsn.safety_data_sheet.xsd._3.GHSSignalWordsCodeType;
import gs1.gdsn.safety_data_sheet.xsd._3.GHSSymbolDescriptionCodeType;
import gs1.gdsn.safety_data_sheet.xsd._3.ProtectiveEquipmentBodyAreaCodeType;
import gs1.gdsn.safety_data_sheet.xsd._3.RecommendedStatusCodeType;
import gs1.gdsn.safety_data_sheet.xsd._3.RouteOfExposureCodeType;
import gs1.gdsn.safety_data_sheet.xsd._3.SDSStandardCodeType;
import gs1.gdsn.safety_data_sheet.xsd._3.SpecificGravityReferenceMaterialCodeType;
import gs1.gdsn.safety_data_sheet.xsd._3.TestSpeciesCodeType;
import gs1.gdsn.safety_data_sheet.xsd._3.WaterSolubilityTypeCodeType;
import gs1.gdsn.sales_information.xsd._3.BrandDistributionTradeItemTypeCodeType;
import gs1.gdsn.sales_information.xsd._3.BrandDistributionTypeCodeType;
import gs1.gdsn.sales_information.xsd._3.ConsumerSalesConditionTypeCodeType;
import gs1.gdsn.sales_information.xsd._3.CutForSaleThicknessCodeType;
import gs1.gdsn.sales_information.xsd._3.DiscountBaseTypeCodeType;
import gs1.gdsn.sales_information.xsd._3.PaymentTermsEventCodeType;
import gs1.gdsn.sales_information.xsd._3.PriceByMeasureTypeCodeType;
import gs1.gdsn.sales_information.xsd._3.PriceComparisonContentTypeCodeType;
import gs1.gdsn.sales_information.xsd._3.RecommendedConsumerPickupAreaCodeType;
import gs1.gdsn.sales_information.xsd._3.TradeItemConditionCodeType;
import gs1.gdsn.sales_information.xsd._3.TradeItemExclusiveSellingLocationCodeType;
import gs1.gdsn.sales_information.xsd._3.TradeItemPriceTypeCodeType;
import gs1.gdsn.security_tag_information.xsd._3.SecurityTagLocationCodeType;
import gs1.gdsn.security_tag_information.xsd._3.SecurityTagTypeCodeType;
import gs1.gdsn.software_system_requirements.xsd._3.SystemRequirementsQualifierTypeCodeType;
import gs1.gdsn.sustainability_module.xsd._3.SustainabilityProgramCodeType;
import gs1.gdsn.trade_item.xsd._3.ReasonForCPVCodeType;
import gs1.gdsn.trade_item_data_carrier_and_identification.xsd._3.ApplicationIdentifierTypeCodeType;
import gs1.gdsn.trade_item_data_carrier_and_identification.xsd._3.DataCarrierFamilyTypeCodeType;
import gs1.gdsn.trade_item_data_carrier_and_identification.xsd._3.DataCarrierPresenceCodeType;
import gs1.gdsn.trade_item_data_carrier_and_identification.xsd._3.DataCarrierTypeCodeType;
import gs1.gdsn.trade_item_data_carrier_and_identification.xsd._3.GS1TradeItemIdentificationKeyTypeCodeType;
import gs1.gdsn.trade_item_description.xsd._3.EContentEnvironmentTypeCodeType;
import gs1.gdsn.trade_item_description.xsd._3.OpacityTypeCodeType;
import gs1.gdsn.trade_item_description.xsd._3.TradeItemFormCodeType;
import gs1.gdsn.trade_item_description.xsd._3.TradeItemVariantTypeCodeType;
import gs1.gdsn.trade_item_disposal_information.xsd._3.SparePartsAvailabilityEffectiveDateTypeCodeType;
import gs1.gdsn.trade_item_disposal_information.xsd._3.TypeOfWasteCodeType;
import gs1.gdsn.trade_item_handling.xsd._3.StackingFactorTypeCodeType;
import gs1.gdsn.trade_item_handling.xsd._3.StackingPatternTypeCodeType;
import gs1.gdsn.trade_item_licensing.xsd._3.LicenseCodeType;
import gs1.gdsn.trade_item_measurements.xsd._3.FrontFaceTypeCodeType;
import gs1.gdsn.trade_item_measurements.xsd._3.NestingDirectionCodeType;
import gs1.gdsn.trade_item_measurements.xsd._3.NestingTypeCodeType;
import gs1.gdsn.trade_item_measurements.xsd._3.OrientationTypeCodeType;
import gs1.gdsn.trade_item_measurements.xsd._3.PegHoleTypeCodeType;
import gs1.gdsn.trade_item_size.xsd._3.SizeGroupCodeType;
import gs1.gdsn.trade_item_size.xsd._3.SizeSystemCodeType;
import gs1.gdsn.trade_item_size.xsd._3.SizeTypeCodeType;
import gs1.gdsn.trade_item_temperature_information.xsd._3.TradeItemTemperatureConditionTypeCodeType;
import gs1.gdsn.transportation_hazardous_classification.xsd._3.HazardousMaterialsTransportationModeCodeType;
import gs1.gdsn.variable_trade_item_information.xsd._3.VariableTradeItemTypeCodeType;
import gs1.gdsn.video_display_device_information.xsd._3.AudioVisualItemInstallationTypeCodeType;
import gs1.gdsn.video_display_device_information.xsd._3.CombFilterTechnologyTypeCodeType;
import gs1.gdsn.video_display_device_information.xsd._3.DisplayResolutionCodeType;
import gs1.gdsn.video_display_device_information.xsd._3.DisplayScreenTypeCodeType;
import gs1.gdsn.video_display_device_information.xsd._3.MultiPictureDisplayCapabilityTypeCodeType;
import gs1.gdsn.video_display_device_information.xsd._3.TelevisionInformationServiceTypeCodeType;
import gs1.gdsn.video_display_device_information.xsd._3.VESAWallMountTypeCodeType;


/**
 * <p>Java class for GS1CodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GS1CodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:gs1:shared:shared_common:xsd:3&gt;String80Type"&gt;
 *       &lt;attribute name="codeListVersion"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="35"/&gt;
 *             &lt;minLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GS1CodeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    AdditionalConsignmentIdentificationTypeCodeType.class,
    AdditionalIndividualAssetIdentificationTypeCodeType.class,
    AdditionalLogisticUnitIdentificationTypeCodeType.class,
    AdditionalPartyIdentificationTypeCodeType.class,
    AdditionalReturnableAssetIdentificationTypeCodeType.class,
    AdditionalServiceRelationIdentificationTypeCodeType.class,
    AdditionalShipmentIdentificationTypeCodeType.class,
    AdditionalTradeItemIdentificationTypeCodeType.class,
    AllowanceChargeTypeCodeType.class,
    BarCodeTypeCodeType.class,
    ColourFamilyCodeType.class,
    ColourTintCodeType.class,
    CommunicationChannelCodeType.class,
    ContactTypeCodeType.class,
    CountryCodeType.class,
    CountrySubdivisionCodeType.class,
    CurrencyCodeType.class,
    DateFormatCodeType.class,
    EntityTypeCodeType.class,
    FinancialAccountNumberTypeCodeType.class,
    FinancialRoutingNumberTypeCodeType.class,
    IncotermsCodeType.class,
    LanguageCodeType.class,
    MeasurementUnitCodeType.class,
    NutrientTypeCodeType.class,
    PartyRoleCodeType.class,
    PatternCodeType.class,
    PaymentMethodCodeType.class,
    PaymentTermsTypeCodeType.class,
    TaxCategoryCodeType.class,
    TemperatureMeasurementUnitCodeType.class,
    TimeMeasurementUnitCodeType.class,
    AdditionalTradeItemClassificationCodeListCodeType.class,
    AspectRatioDescriptionCodeType.class,
    AspectRatioDimensionCodeType.class,
    BioengineeredDeclarationClaimCodeType.class,
    CatalogueItemConfirmationStatusCodeType.class,
    ConfirmationStatusReasonCodeType.class,
    CorrectiveActionCodeType.class,
    CriteriaJoinTypeCodeType.class,
    CriteriaOperatorTypeCodeType.class,
    DangerousGoodsTransportCategoryCodeType.class,
    DimensionTypeCodeType.class,
    DisplayTypeCodeType.class,
    DistributionMethodCodeType.class,
    ExceptionMessageTypeCodeType.class,
    GrowingMethodCodeType.class,
    HierarchyDeletionReasonCodeType.class,
    ImageFacingCodeType.class,
    ImageOrientationTypeCodeType.class,
    ImageStateCodeType.class,
    IsReloadReasonCodeType.class,
    LevelOfContainmentCodeType.class,
    MaterialAgencyCodeType.class,
    MaturationMethodCodeType.class,
    MeasurementPrecisionCodeType.class,
    NutritionAgencyCodeType.class,
    OrganicClaimAgencyCodeType.class,
    OrganicClaimAgencyTypeCodeType.class,
    OrganicProductPlaceOfFarmingCodeType.class,
    OrganicTradeItemCodeType.class,
    PackagingMaterialTypeCodeType.class,
    PhaseOfMatterCodeType.class,
    PostHarvestTreatmentChemicalCodeType.class,
    PostProcessTradeItemTreatmentPhysicalCodeType.class,
    PreliminaryItemStatusCodeType.class,
    PreparationTypeCodeType.class,
    PreservationTechniqueTypeCodeType.class,
    ProductActivityTypeCodeType.class,
    ReferencedFileTypeCodeType.class,
    ReferencedTradeItemTypeCodeType.class,
    RegistryCatalogueItemStateCodeType.class,
    SourceAnimalCodeType.class,
    SustainabilityFeatureCodeType.class,
    TemperatureQualifierCodeType.class,
    TradeChannelCodeType.class,
    TradeItemContextCodeType.class,
    TradeItemUnitDescriptorCodeType.class,
    TransactionalMeasurementUnitCodeType.class,
    ReasonForCPVCodeType.class,
    AlcoholBeverageDistilledFromCodeType.class,
    AlcoholBeverageFilteringMethodTypeCodeType.class,
    AlcoholBeverageProductionMethodTypeCodeType.class,
    AlcoholBeverageTypeCodeType.class,
    AlcoholicBeverageColourCodeType.class,
    BeerStyleTypeCodeType.class,
    ContainerMaterialCodeType.class,
    ContainerProcessTypeCodeType.class,
    ContainerShapeCodeType.class,
    ContainerTypeCodeType.class,
    OriginOfWineCodeType.class,
    PrimaryAddedFlavouringCodeType.class,
    SecondaryAddedFlavouringCodeType.class,
    SweetnessLevelOfAlcoholicBeverageCodeType.class,
    AllergenTypeCodeType.class,
    AnimalFoodProcessOrStateTypeCodeType.class,
    AnimalFoodTypeCodeType.class,
    AnimalTargetedHealthConditionCodeType.class,
    AnimalTargetSizeCodeType.class,
    FeedLifestageCodeType.class,
    FeedTypeCodeType.class,
    TargetedConsumptionByCodeType.class,
    ClosureOrFastenerTypeCodeType.class,
    HangerStandardAgencyCodeType.class,
    AudioVisualMediaContributorTypeCodeType.class,
    ClosedCaptioningCodeType.class,
    DistributionMediaTypeCodeType.class,
    DubbedSubtitledCodeType.class,
    DVDRegionCodeType.class,
    GameFormatCodeType.class,
    AudioVisualMediaDateTypeCodeType.class,
    AudioSoundTypeCodeType.class,
    DigitalisationLevelTypeCodeType.class,
    VisualMediaColourCodeType.class,
    BatteryTechnologyTypeCodeType.class,
    BatteryTypeCodeType.class,
    BatteryTypeQualifierCodeType.class,
    PowerSupplyTypeCodeType.class,
    CarcinogenicMutagenicReprotoxicTypeCodeType.class,
    ChemicalPhysicalStateCodeType.class,
    ChemicalPropertyTypeCodeType.class,
    RegulatedChemicalTypeCodeType.class,
    ChildNutritionQualifierCodeType.class,
    DexterityUsageCodeType.class,
    ProductUsageBodyLocationCodeType.class,
    RequiredEducationTrainingTypeCodeType.class,
    TypeOfCleaningCodeType.class,
    TypeOfCleaningDisinfectionProcessCodeType.class,
    TypeOfDisinfectionCodeType.class,
    CatchAreaCodeGDSNType.class,
    CatchMethodCodeType.class,
    CheeseMaturationProcessContainerTypeCodeType.class,
    CheeseMilkAcquisitionTypeCodeType.class,
    CheeseRipeningProcessCodeType.class,
    CheeseTypeCodeType.class,
    DateOfCatchProcessTypeCodeType.class,
    FirmnessOfCheeseCodeType.class,
    FishSeafoodPresentationCodeType.class,
    ProductionMethodForFishAndSeafoodCodeType.class,
    RennetTypeCodeType.class,
    SaltMoistureContentCodeType.class,
    StorageStateCodeType.class,
    SurfaceOfCheeseAtEndOfRipeningCodeType.class,
    DangerousSubstancesWaterSolubilityCodeType.class,
    DeliveryFrequencyCodeType.class,
    OrderableReturnableConditionsCodeType.class,
    RightOfReturnForNonSoldTradeItemCodeType.class,
    DietTypeCodeType.class,
    AudioVisualConnectionInputDirectionCodeType.class,
    AudioVisualConnectionLocationCodeType.class,
    AudioVisualConnectionTypeCodeType.class,
    DetachableSpeakerTypeCodeType.class,
    ExternalMemoryTypeCodeType.class,
    FixedSpeakerLocationCodeType.class,
    HDMIFeatureCodeType.class,
    HDMITestingAgencyCodeType.class,
    InternalMemoryTypeCodeType.class,
    MicrophoneTypeCodeType.class,
    RemoteControlTypeCodeType.class,
    ResolutionTypeCodeType.class,
    SignalProcessingTypeCodeType.class,
    SurroundSoundDigitalDecoderTypeCodeType.class,
    TunerTypeCodeType.class,
    GrapeVarietyCodeType.class,
    IngredientOfConcernCodeType.class,
    ProductTextureAgencyCodeType.class,
    ProductTextureCodeType.class,
    ProductYieldTypeCodeType.class,
    MicrobiologicalOrganismCodeType.class,
    MicrobiologicalOrganismMethodOfAnalysisCodeType.class,
    PhysiochemicalCharacteristicCodeType.class,
    CannabisCBDTypeCodeType.class,
    CompulsoryAdditionalLabelInformationTypeCodeType.class,
    NutritionalLabelTypeCodeType.class,
    NutritionalProgramCodeType.class,
    NutritionalProgramIngredientTypeCodeType.class,
    NutritionalProgramStatusCodeType.class,
    PackagingMarkedNutritionLabelCodeType.class,
    AllowedUsageCodeType.class,
    ClinicalSizeMeasurementPrecisionCodeType.class,
    ClinicalSizeTypeCodeType.class,
    ClinicalStorageHandlingTypeCodeType.class,
    ClinicalWarningAgencyCodeType.class,
    HealthcareGroupedProductCodeType.class,
    PrescriptionTypeCodeType.class,
    LightBeamTypeCodeType.class,
    LightBulbFilamentTypeCodeType.class,
    LightBulbLampTypeCodeType.class,
    LightBulbShapeCodeType.class,
    SeasonParameterCodeType.class,
    SpecialItemCodeType.class,
    StrongnessOfBasicTasteCodeType.class,
    TargetConsumerAgeGroupCodeType.class,
    TargetConsumerGenderCodeType.class,
    TargetConsumerUsageTypeCodeType.class,
    TypeOfBasicTasteCodeType.class,
    gs1.gdsn.material.xsd._3.MaterialDensityCodeType.class,
    gs1.gdsn.material.xsd._3.TradeItemMaterialDesignationCodeType.class,
    AnnexXVIIntendedPurposeTypeCodeType.class,
    EUMedicalDeviceStatusCodeType.class,
    EUMedicalDeviceSubStatusCodeType.class,
    HealthcareTradeItemReusabilityTypeCodeType.class,
    MRICompatibilityCodeType.class,
    MultiComponentDeviceTypeCodeType.class,
    RecallScopeTypeCodeType.class,
    SpecialDeviceTypeCodeType.class,
    SterilisationTypeCodeType.class,
    SystemOrProcedurePackTypeCodeType.class,
    UDIProductionIdentifierTypeCodeType.class,
    NonfoodIngredientOfConcernCodeType.class,
    FoodBeverageCompositionDatabaseCodeType.class,
    NutrientBasisQuantityTypeCodeType.class,
    NutrientValueDerivationCodeType.class,
    ONIXAudienceCodeValueCodeType.class,
    ONIXAudiencePrecisionCodeType.class,
    ONIXAudienceRangeQualifierCodeType.class,
    ONIXAudienceTypeCodeListCodeType.class,
    ONIXContentDateRoleTypeCodeType.class,
    ONIXContributorPlaceTypeCodeType.class,
    ONIXContributorRoleCodeType.class,
    ONIXEditionTypeCodeType.class,
    ONIXEpubTechnicalProtectionTypeCodeType.class,
    ONIXExtentTypeCodeType.class,
    ONIXExtentUnitTypeCodeType.class,
    ONIXIllustrationTypeCodeType.class,
    ONIXNameTypeCodeType.class,
    ONIXProductAvailabilityCodeType.class,
    ONIXPublicationDateTypeCodeType.class,
    ONIXPublicationDescriptionTypeCodeType.class,
    ONIXPublisherRoleTypeCodeType.class,
    ONIXSalesRightsTypeCodeType.class,
    ONIXSeriesIdentifierTypeCodeType.class,
    ONIXSubjectSchemeIdentifierCodeType.class,
    ONIXTitleTypeCodeType.class,
    ZoomTypeCodeType.class,
    AverageDistanceToPointOfPackagingCodeType.class,
    PackageTypeCodeType.class,
    PackagingFeatureCodeType.class,
    PackagingFunctionCodeType.class,
    PackagingLabellingTypeCodeType.class,
    PackagingMaterialAppliedProcessCodeType.class,
    PackagingMaterialElementCodeType.class,
    PackagingMaterialPerformanceCodeType.class,
    PackagingRawMaterialCodeType.class,
    PackagingRecyclabilityAssessmentSpecificationCodeType.class,
    PackagingRecyclingProcessTypeCodeType.class,
    PackagingRecyclingSchemeCodeType.class,
    PackagingShapeCodeType.class,
    PackagingTermsAndConditionsCodeType.class,
    PlatformTermsAndConditionsCodeType.class,
    PlatformTypeCodeType.class,
    ShippingContainerTypeCodeType.class,
    ConsumerWarningTypeCodeType.class,
    DateOnPackagingFormatTypeCodeType.class,
    PackagingMarkedLabelAccreditationCodeType.class,
    SerialNumberLocationCodeType.class,
    TradeItemDateOnPackagingTypeCodeType.class,
    TradeItemIdentificationMarkingTypeCodeType.class,
    TypeOfProductChangesAfterDateCodeType.class,
    AcidificationMeasurementProtocolCodeType.class,
    AcidificationMeasurementReferenceSubstanceCodeType.class,
    AquaticEutrophicationModelCodeType.class,
    AquaticEutrophicationReferenceSubstanceCodeType.class,
    AquaticEutrophicationWaterBodyTypeCodeType.class,
    CumulativeEnergyDemandProtocolCodeType.class,
    CumulativeEnergyDemandReferenceSubstanceCodeType.class,
    CumulativeEnergyDemandTypeCodeType.class,
    FreshWaterEcotoxicityModelCodeType.class,
    FreshWaterEcotoxicityReferenceSubstanceCodeType.class,
    FunctionalBasisUnitCodeType.class,
    GlobalWarmingPotentialEquivalentBasisYearsCodeType.class,
    GlobalWarmingPotentialEquivalentProtocolCodeType.class,
    GlobalWarmingPotentialEquivalentSubstanceCodeType.class,
    HazardousSubstancesMinimizationCodeType.class,
    MassEquivalentCodeType.class,
    MassEquivalentProtocolCodeType.class,
    PackagingChainOfCustodySourceCertifiedCodeType.class,
    PackagingLevelTypeCodeType.class,
    PackagingRecoveryRateTypeCodeType.class,
    PackagingRecycledContentTypeCodeType.class,
    PackagingRenewableContentTypeCodeType.class,
    PackagingReusabilityStandardCodeType.class,
    ProofOfOptimizedPackagingWeightStandardCodeType.class,
    ProofOfPackagingWeightReductionStandardCodeType.class,
    SourceCertificationSystemProtocolCodeType.class,
    TotalPackagingEconomicCostMeasurementCodeType.class,
    ToxicityMeasurementProtocolCodeType.class,
    ToxicityReferenceSubstanceCodeType.class,
    PhysicalResourceTypeCodeType.class,
    PhysicalResourceUsageMeasurementTypeCodeType.class,
    RunModeCodeType.class,
    ImportClassificationTypeCodeType.class,
    BendAngleCodeType.class,
    MeshMaterialCodeType.class,
    MeshSizeCodeType.class,
    PlumbingControlTypeCodeType.class,
    PlumbingHVACConnectionAgencyCodeType.class,
    PlumbingHVACConnectionTypeCodeType.class,
    ThreadTypeCodeType.class,
    WorkingPressureRatingClassCodeType.class,
    ProductCharacteristicCodeType.class,
    ApparelDetailApplicationCodeType.class,
    ApparelDetailPlacementCodeType.class,
    ApparelDetailSizeCodeType.class,
    ApparelDetailTypeCodeType.class,
    BrushBroomTypeCodeType.class,
    ClaimElementCodeType.class,
    ClaimTypeCodeType.class,
    CleaningClothTypeCodeType.class,
    DentalProductFunctionCodeType.class,
    DispenserTypeCodeType.class,
    FootwearOutsoleTypeCodeType.class,
    FootwearStyleCodeType.class,
    FormationTypeCodeType.class,
    GarmentAdornmentTypeCodeType.class,
    GarmentLegTypeCodeType.class,
    GarmentLengthTypeCodeType.class,
    GarmentLinedCodeType.class,
    HairProductFunctionOrTreatmentCodeType.class,
    HatTypeCodeType.class,
    HeelStyleCodeType.class,
    HosierySockRiseCodeType.class,
    HosierySockStyleCodeType.class,
    HouseholdCleaningProductTypeCodeType.class,
    JewelrySetContentsCodeType.class,
    JewelryStyleCodeType.class,
    LaundryDetergentTypeCodeType.class,
    LaundryHangingAidTypeCodeType.class,
    NaturalHairColourCodeType.class,
    NecklaceTypeCodeType.class,
    NeckwearTypeCodeType.class,
    PantsShortsTypeCodeType.class,
    PerfumeFragranceDilutionClassCodeType.class,
    PillowShapeCodeType.class,
    RingTypeCodeType.class,
    RugTypeCodeType.class,
    SeamsCodeType.class,
    SkinProductFunctionOrTreatmentCodeType.class,
    SkirtTypeCodeType.class,
    SpongeScourerTypeCodeType.class,
    SportCodeType.class,
    SweaterPulloverTypeCodeType.class,
    TablewareTypeCodeType.class,
    TargetHairTypeCodeType.class,
    TargetSkinTypeCodeType.class,
    TargetSurfaceTypeCodeType.class,
    TimeOfApplicationCodeType.class,
    ToeStyleTypeCodeType.class,
    TowelTypeCodeType.class,
    WaistbandTypeCodeType.class,
    WaistRiseCodeType.class,
    WatchCaseShapeCodeType.class,
    CreditableIngredientTypeCodeType.class,
    VegetableSubgroupCodeType.class,
    PromotionTypeCodeType.class,
    FlammableAerosolContainmentCodeType.class,
    RatingContentDescriptorCodeType.class,
    AdditionalCameraAngleCodeType.class,
    FileCameraPerspectiveCodeType.class,
    FileColourSchemeCodeType.class,
    ItemDepictionCodeType.class,
    ItemPositionCodeType.class,
    VerticalCameraAngleCodeType.class,
    RegulationCommunityLevelCodeType.class,
    RegulationTypeCodeType.class,
    RegulatoryActComplianceLevelCodeType.class,
    FlashPointTestMethodCodeType.class,
    GHSSignalWordsCodeType.class,
    GHSSymbolDescriptionCodeType.class,
    ProtectiveEquipmentBodyAreaCodeType.class,
    RecommendedStatusCodeType.class,
    RouteOfExposureCodeType.class,
    SDSStandardCodeType.class,
    SpecificGravityReferenceMaterialCodeType.class,
    TestSpeciesCodeType.class,
    WaterSolubilityTypeCodeType.class,
    BrandDistributionTradeItemTypeCodeType.class,
    BrandDistributionTypeCodeType.class,
    ConsumerSalesConditionTypeCodeType.class,
    CutForSaleThicknessCodeType.class,
    DiscountBaseTypeCodeType.class,
    PaymentTermsEventCodeType.class,
    PriceByMeasureTypeCodeType.class,
    PriceComparisonContentTypeCodeType.class,
    RecommendedConsumerPickupAreaCodeType.class,
    TradeItemConditionCodeType.class,
    TradeItemExclusiveSellingLocationCodeType.class,
    TradeItemPriceTypeCodeType.class,
    SecurityTagLocationCodeType.class,
    SecurityTagTypeCodeType.class,
    SystemRequirementsQualifierTypeCodeType.class,
    SustainabilityProgramCodeType.class,
    gs1.gdsn.textile_material.xsd._3.MaterialDensityCodeType.class,
    gs1.gdsn.textile_material.xsd._3.TradeItemMaterialDesignationCodeType.class,
    ApplicationIdentifierTypeCodeType.class,
    DataCarrierFamilyTypeCodeType.class,
    DataCarrierPresenceCodeType.class,
    DataCarrierTypeCodeType.class,
    GS1TradeItemIdentificationKeyTypeCodeType.class,
    EContentEnvironmentTypeCodeType.class,
    OpacityTypeCodeType.class,
    TradeItemFormCodeType.class,
    TradeItemVariantTypeCodeType.class,
    SparePartsAvailabilityEffectiveDateTypeCodeType.class,
    TypeOfWasteCodeType.class,
    StackingFactorTypeCodeType.class,
    StackingPatternTypeCodeType.class,
    LicenseCodeType.class,
    FrontFaceTypeCodeType.class,
    NestingDirectionCodeType.class,
    NestingTypeCodeType.class,
    OrientationTypeCodeType.class,
    PegHoleTypeCodeType.class,
    SizeGroupCodeType.class,
    SizeSystemCodeType.class,
    SizeTypeCodeType.class,
    TradeItemTemperatureConditionTypeCodeType.class,
    HazardousMaterialsTransportationModeCodeType.class,
    VariableTradeItemTypeCodeType.class,
    AudioVisualItemInstallationTypeCodeType.class,
    CombFilterTechnologyTypeCodeType.class,
    DisplayResolutionCodeType.class,
    DisplayScreenTypeCodeType.class,
    MultiPictureDisplayCapabilityTypeCodeType.class,
    TelevisionInformationServiceTypeCodeType.class,
    VESAWallMountTypeCodeType.class
})
public class GS1CodeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "codeListVersion")
    protected String codeListVersion;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the codeListVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListVersion() {
        return codeListVersion;
    }

    /**
     * Sets the value of the codeListVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListVersion(String value) {
        this.codeListVersion = value;
    }

}
