package ro.ase.cts.test;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.categorii.CategorieTesteNormale;
import ro.ase.cts.categorii.CategorieTestePromovabilitate;

@RunWith(Categories.class)
@SuiteClasses({ TestGrupa.class, TestGrupaWithDummy.class, TestGrupaWithFake.class,
		TestGrupaWithStub.class })

//@IncludeCategory(CategorieTestePromovabilitate.class)
//@ExcludeCategory(CategorieTesteNormale.class)
public class SuitaCustomTestePromovabilitate {
}
