package net.calebscode.langtool.phonology.phoneme;

import java.util.ArrayList;
import java.util.List;

public class IpaPhonemeCollection implements IpaPhonemeMapper {

	private List<IpaPhonemeMap> maps = new ArrayList<>();
	
	public void addPhonemeMap(IpaPhonemeMap map) {
		maps.add(map);
	}
	
	@Override
	public boolean hasIpa(String ipa) {
		for (var map : maps) {
			if (map.hasIpa(ipa)) return true;
		}
		return false;
	}
	
	@Override
	public boolean hasPhoneme(Phoneme phoneme) {
		for (var map : maps) {
			if (map.hasPhoneme(phoneme)) return true;
		}
		return false;
	}

	@Override
	public Phoneme getPhoneme(String ipa) {
		for (var map : maps) {
			if (map.hasIpa(ipa)) return map.getPhoneme(ipa);
		}
		return null;
	}

}