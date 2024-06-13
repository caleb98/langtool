package net.calebscode.langtool.app;

import static net.calebscode.langtool.phonology.phoneme.StandardPhonemes.STANDARD_IPA_PHONEMES;

import net.calebscode.langtool.phonology.rules.PhonologicalRuleCompiler;

public class TestMain {
	public static void main(String[] args) throws Exception {

//		var parser = GreedyPhonemeParser.createGreedyIPAParser();
//		var parsed = parser.parse("kəlɛkʃən");
//
//		var first = new Syllable(parser.parse("k").toArray(new Phoneme[]{}), parser.parse("ə").toArray(new Phoneme[]{}), null);
//		var second = new Syllable(parser.parse("l").toArray(new Phoneme[]{}), parser.parse("ɛ").toArray(new Phoneme[]{}), parser.parse("k").toArray(new Phoneme[]{}));
//		var third = new Syllable(parser.parse("ʃ").toArray(new Phoneme[]{}), parser.parse("ə").toArray(new Phoneme[]{}), parser.parse("n").toArray(new Phoneme[]{}));
//
//		var word = new Word(first, second, third);
//
//		var psb = new PhonemeSequenceBuilder();
//		psb.append(word);
//		var seq = psb.build();
//
//		System.out.println(seq);

		var prc = new PhonologicalRuleCompiler(STANDARD_IPA_PHONEMES);
		var rule = prc.compile("[+stop, +consonant, +alveolar] -> [ɾ] / # [+vowel, 1_stressed] _ [+vowel, -1_stressed]");

		System.out.println("");

	}
}