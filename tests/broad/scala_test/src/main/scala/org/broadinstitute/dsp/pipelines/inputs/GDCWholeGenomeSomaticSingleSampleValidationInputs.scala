package org.broadinstitute.dsp.pipelines.inputs

import java.net.URI
import io.circe.generic.extras.semiauto.{
  deriveConfiguredDecoder,
  deriveConfiguredEncoder
}
import io.circe.{Decoder, Encoder}

object GDCWholeGenomeSomaticSingleSampleValidationInputs
  extends EncodableInputs[GDCWholeGenomeSomaticSingleSampleValidationInputs] {
  override def workflowNames: Seq[String] = Seq("VerifySomaticSingleSample")
  override implicit val decoder: Decoder[GDCWholeGenomeSomaticSingleSampleValidationInputs] =
    deriveConfiguredDecoder
  override implicit val encoder: Encoder[GDCWholeGenomeSomaticSingleSampleValidationInputs] =
    deriveConfiguredEncoder
}

case class GDCWholeGenomeSomaticSingleSampleValidationInputs(
                                                testMetrics: Seq[URI],
                                                truthMetrics: Seq[URI],
                                                testCram: URI,
                                                testCrai: URI,
                                                truthCram: URI,
                                                truthCrai: URI,
                                              )
