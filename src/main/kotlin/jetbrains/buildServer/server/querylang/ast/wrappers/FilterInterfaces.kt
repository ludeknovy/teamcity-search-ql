package jetbrains.buildServer.server.querylang.ast.wrappers

import jetbrains.buildServer.serverSide.artifacts.SArtifactDependency
import jetbrains.buildServer.serverSide.dependency.Dependency
import jetbrains.buildServer.util.Option


interface TopLevelObject

interface FIdContainer {
    val id: String
}

interface FProjectContainer {
    val project: WProject
}

interface FBuildConfContainer {
    val buildConfs : List<WBuildConf>
}

interface FVcsRootContainer {
    val vcsRoots : List<WVcsRoot>
}

interface FParentContainer {
    val parent: WProject?
}

interface FTriggerContainer : EnabledChecker {
    val triggers: List<WTrigger>
    val ownTriggers: List<WTrigger>
}

interface FStepContainer : EnabledChecker {
    val steps: List<WStep>
    val ownSteps: List<WStep>
}

interface FFeatureContainer : EnabledChecker {
    val features: List<WFeature>
    val ownFeatures: List<WFeature>
}

interface FTemplateContainer {
    val templates: List<WTemplate>
}

interface FParamContainer {
    val ownParams: List<WResolvableParam>
    val params: List<WResolvableParam>
}

interface FEnabledContainer {
    val isEnabled: Boolean
}

interface FAncestorContainer {
    val firstAncestor: WProject?
}

interface FVcsRootEntryContainer {
    val ownVcsRootEntries: List<WVcsRootEntry>
    val vcsRootEntries: List<WVcsRootEntry>
}

interface FDependencyContainer {
    val dependencies: List<SuperDependency>
    val ownDependencies: List<SuperDependency>
}

interface FOptionContainer {
    val options: List<WResolvableParam>
    val ownOptions: List<WResolvableParam>

    fun getOption(opt: Option<Any>) : Any
}

interface FTypeContainer {
    val type: String
}

interface FRulesContainer {
    val rules: List<ResolvableString>
}

interface FValueContainer {
    val values: List<ResolvableString>
}

interface FNameContainer {
    val name: String
}

interface FSubProjectContainer {
    val subProjects: List<WProject>
}