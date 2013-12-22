package peddler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Peddler.modid, name = Peddler.modid, version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = true, channels = {Peddler.modid})
public class Peddler {

	public static final String modid = "peddler";

	@SidedProxy(clientSide = "peddler.ClientProxy", serverSide = "peddler.CommonProxy")
	public static CommonProxy proxy;

	@Instance("Peddler")
	public static Peddler instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}

	// 交易BOXの追加（遠隔地との取引）
	// 取引BOXの追加
	// 取引ノートの追加
	// 交易BOXを開くと取引ノートに場所が追加される
	// 交易BOXでの取引は完了までに時間がかかる
	// 取引BOXの取引はその場で完了
	// 取引BOXは通常の村人取引と同様
	// 通常の村生成は削除
	// 木・土・草・石ブロックは通常破壊不可
	// 取引で手に入るツールで破壊できる
	// ツールは耐久度少なめ＆破壊可能範囲限定
	// 特色を出すために取引の種類は数個
	// ワールド生成は正方形の島が橋でつながっている形に
	// 村にはベッドがある
	// 寝るとMP減少
	// 寝ないでいるとめまいエフェクト
}
