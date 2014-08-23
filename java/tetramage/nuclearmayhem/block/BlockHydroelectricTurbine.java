package tetramage.nuclearmayhem.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import tetramage.nuclearmayhem.tileentity.TileEntityHydroelectricTurbine;

public class BlockHydroelectricTurbine extends BlockContainer {

	public BlockHydroelectricTurbine(int i, Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHardness(10F);
	}


	public int getRenderType(){
		return -1;
	}
	
	public boolean isOpaqueCube(){
		return false;
	}
	
	
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityHydroelectricTurbine();
	}
	
	public boolean isMultiBlockStructure(World world, int x, int y, int z) {
		if (checkNorth(world, x, y, z))/* North */
			return true;
		if (checkEast(world, x, y, z))/* East */
			return true;
		if (checkSouth(world, x, y, z))/* South */
			return true;
		if (checkWest(world, x, y, z))/* West */
			return true;
		return false;
	}

	private static boolean checkNorth(World world, int x, int y, int z) {
		if (world.getBlockMetadata(x + -2, y + -1, z + 1) == 3013) {
			if (world.getBlockMetadata(x + -2, y + -1, z + 0) == 3013) {
				if (world.getBlockMetadata(x + -2, y + -1, z + -1) == 3013) {
					if (world.getBlockMetadata(x + -2, y + 0, z + 1) == 0) {
						if (world.getBlockMetadata(x + -2, y + 0, z + 0) == 3020) {
							if (world.getBlockMetadata(x + -2, y + 0, z + -1) == 0) {
								if (world.getBlockMetadata(x + -2, y + 1, z + 1) == 3013) {
									if (world.getBlockMetadata(x + -2, y + 1, z + 0) == 3013) {
										if (world.getBlockMetadata(x + -2, y + 1, z
												+ -1) == 3013) {
											if (world.getBlockMetadata(x + -1,
													y + -1, z + 1) == 3013) {
												if (world.getBlockMetadata(x + -1, y
														+ -1, z + 0) == 3013) {
													if (world.getBlockMetadata(
															x + -1, y + -1, z
																	+ -1) == 3013) {
														if (world.getBlockMetadata(x
																+ -1, y + 0,
																z + 1) == 0) {
															if (world
																	.getBlockMetadata(
																			x
																					+ -1,
																			y + 0,
																			z + 0) == 3020) {
																if (world
																		.getBlockMetadata(
																				x
																						+ -1,
																				y + 0,
																				z
																						+ -1) == 0) {
																	if (world
																			.getBlockMetadata(
																					x
																							+ -1,
																					y + 1,
																					z + 1) == 3013) {
																		if (world
																				.getBlockMetadata(
																						x
																								+ -1,
																						y + 1,
																						z + 0) == 3013) {
																			if (world
																					.getBlockMetadata(
																							x
																									+ -1,
																							y + 1,
																							z
																									+ -1) == 3013) {
																				if (world
																						.getBlockMetadata(
																								x + 0,
																								y
																										+ -1,
																								z + 1) == 3013) {
																					if (world
																							.getBlockMetadata(
																									x + 0,
																									y
																											+ -1,
																									z + 0) == 3013) {
																						if (world
																								.getBlockMetadata(
																										x + 0,
																										y
																												+ -1,
																										z
																												+ -1) == 3013) {
																							if (world
																									.getBlockMetadata(
																											x + 0,
																											y + 0,
																											z + 1) == 0) {
																								if (world
																										.getBlockMetadata(
																												x + 0,
																												y + 0,
																												z
																														+ -1) == 0) {
																									if (world
																											.getBlockMetadata(
																													x + 0,
																													y + 1,
																													z + 1) == 3013) {
																										if (world
																												.getBlockMetadata(
																														x + 0,
																														y + 1,
																														z + 0) == 3013) {
																											if (world
																													.getBlockMetadata(
																															x + 0,
																															y + 1,
																															z
																																	+ -1) == 3013) {
																												if (world
																														.getBlockMetadata(
																																x + 1,
																																y
																																		+ -1,
																																z + 1) == 3013) {
																													if (world
																															.getBlockMetadata(
																																	x + 1,
																																	y
																																			+ -1,
																																	z + 0) == 3013) {
																														if (world
																																.getBlockMetadata(
																																		x + 1,
																																		y
																																				+ -1,
																																		z
																																				+ -1) == 3013) {
																															if (world
																																	.getBlockMetadata(
																																			x + 1,
																																			y + 0,
																																			z + 1) == 0) {
																																if (world
																																		.getBlockMetadata(
																																				x + 1,
																																				y + 0,
																																				z + 0) == 3020) {
																																	if (world
																																			.getBlockMetadata(
																																					x + 1,
																																					y + 0,
																																					z
																																							+ -1) == 0) {
																																		if (world
																																				.getBlockMetadata(
																																						x + 1,
																																						y + 1,
																																						z + 1) == 3013) {
																																			if (world
																																					.getBlockMetadata(
																																							x + 1,
																																							y + 1,
																																							z + 0) == 3013) {
																																				if (world
																																						.getBlockMetadata(
																																								x + 1,
																																								y + 1,
																																								z
																																										+ -1) == 3013) {
																																					if (world
																																							.getBlockMetadata(
																																									x + 2,
																																									y
																																											+ -1,
																																									z + 1) == 3013) {
																																						if (world
																																								.getBlockMetadata(
																																										x + 2,
																																										y
																																												+ -1,
																																										z + 0) == 3013) {
																																							if (world
																																									.getBlockMetadata(
																																											x + 2,
																																											y
																																													+ -1,
																																											z
																																													+ -1) == 3013) {
																																								if (world
																																										.getBlockMetadata(
																																												x + 2,
																																												y + 0,
																																												z + 1) == 0) {
																																									if (world
																																											.getBlockMetadata(
																																													x + 2,
																																													y + 0,
																																													z + 0) == 3020) {
																																										if (world
																																												.getBlockMetadata(
																																														x + 2,
																																														y + 0,
																																														z
																																																+ -1) == 0) {
																																											if (world
																																													.getBlockMetadata(
																																															x + 2,
																																															y + 1,
																																															z + 1) == 3013) {
																																												if (world
																																														.getBlockMetadata(
																																																x + 2,
																																																y + 1,
																																																z + 0) == 3013) {
																																													if (world
																																															.getBlockMetadata(
																																																	x + 2,
																																																	y + 1,
																																																	z
																																																			+ -1) == 3013) {
																																														return true;
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

	private static boolean checkEast(World world, int x, int y, int z) {
		if (world.getBlockMetadata(x + -1, y + -1, z + -2) == 3013) {
			if (world.getBlockMetadata(x + 0, y + -1, z + -2) == 3013) {
				if (world.getBlockMetadata(x + 1, y + -1, z + -2) == 3013) {
					if (world.getBlockMetadata(x + -1, y + 0, z + -2) == 0) {
						if (world.getBlockMetadata(x + 0, y + 0, z + -2) == 3020) {
							if (world.getBlockMetadata(x + 1, y + 0, z + -2) == 0) {
								if (world.getBlockMetadata(x + -1, y + 1, z + -2) == 3013) {
									if (world.getBlockMetadata(x + 0, y + 1, z + -2) == 3013) {
										if (world.getBlockMetadata(x + 1, y + 1, z
												+ -2) == 3013) {
											if (world.getBlockMetadata(x + -1,
													y + -1, z + -1) == 3013) {
												if (world.getBlockMetadata(x + 0, y
														+ -1, z + -1) == 3013) {
													if (world.getBlockMetadata(x + 1,
															y + -1, z + -1) == 3013) {
														if (world.getBlockMetadata(x
																+ -1, y + 0, z
																+ -1) == 0) {
															if (world
																	.getBlockMetadata(
																			x + 0,
																			y + 0,
																			z
																					+ -1) == 3020) {
																if (world
																		.getBlockMetadata(
																				x + 1,
																				y + 0,
																				z
																						+ -1) == 0) {
																	if (world
																			.getBlockMetadata(
																					x
																							+ -1,
																					y + 1,
																					z
																							+ -1) == 3013) {
																		if (world
																				.getBlockMetadata(
																						x + 0,
																						y + 1,
																						z
																								+ -1) == 3013) {
																			if (world
																					.getBlockMetadata(
																							x + 1,
																							y + 1,
																							z
																									+ -1) == 3013) {
																				if (world
																						.getBlockMetadata(
																								x
																										+ -1,
																								y
																										+ -1,
																								z + 0) == 3013) {
																					if (world
																							.getBlockMetadata(
																									x + 0,
																									y
																											+ -1,
																									z + 0) == 3013) {
																						if (world
																								.getBlockMetadata(
																										x + 1,
																										y
																												+ -1,
																										z + 0) == 3013) {
																							if (world
																									.getBlockMetadata(
																											x
																													+ -1,
																											y + 0,
																											z + 0) == 0) {
																								if (world
																										.getBlockMetadata(
																												x + 1,
																												y + 0,
																												z + 0) == 0) {
																									if (world
																											.getBlockMetadata(
																													x
																															+ -1,
																													y + 1,
																													z + 0) == 3013) {
																										if (world
																												.getBlockMetadata(
																														x + 0,
																														y + 1,
																														z + 0) == 3013) {
																											if (world
																													.getBlockMetadata(
																															x + 1,
																															y + 1,
																															z + 0) == 3013) {
																												if (world
																														.getBlockMetadata(
																																x
																																		+ -1,
																																y
																																		+ -1,
																																z + 1) == 3013) {
																													if (world
																															.getBlockMetadata(
																																	x + 0,
																																	y
																																			+ -1,
																																	z + 1) == 3013) {
																														if (world
																																.getBlockMetadata(
																																		x + 1,
																																		y
																																				+ -1,
																																		z + 1) == 3013) {
																															if (world
																																	.getBlockMetadata(
																																			x
																																					+ -1,
																																			y + 0,
																																			z + 1) == 0) {
																																if (world
																																		.getBlockMetadata(
																																				x + 0,
																																				y + 0,
																																				z + 1) == 3020) {
																																	if (world
																																			.getBlockMetadata(
																																					x + 1,
																																					y + 0,
																																					z + 1) == 0) {
																																		if (world
																																				.getBlockMetadata(
																																						x
																																								+ -1,
																																						y + 1,
																																						z + 1) == 3013) {
																																			if (world
																																					.getBlockMetadata(
																																							x + 0,
																																							y + 1,
																																							z + 1) == 3013) {
																																				if (world
																																						.getBlockMetadata(
																																								x + 1,
																																								y + 1,
																																								z + 1) == 3013) {
																																					if (world
																																							.getBlockMetadata(
																																									x
																																											+ -1,
																																									y
																																											+ -1,
																																									z + 2) == 3013) {
																																						if (world
																																								.getBlockMetadata(
																																										x + 0,
																																										y
																																												+ -1,
																																										z + 2) == 3013) {
																																							if (world
																																									.getBlockMetadata(
																																											x + 1,
																																											y
																																													+ -1,
																																											z + 2) == 3013) {
																																								if (world
																																										.getBlockMetadata(
																																												x
																																														+ -1,
																																												y + 0,
																																												z + 2) == 0) {
																																									if (world
																																											.getBlockMetadata(
																																													x + 0,
																																													y + 0,
																																													z + 2) == 3020) {
																																										if (world
																																												.getBlockMetadata(
																																														x + 1,
																																														y + 0,
																																														z + 2) == 0) {
																																											if (world
																																													.getBlockMetadata(
																																															x
																																																	+ -1,
																																															y + 1,
																																															z + 2) == 3013) {
																																												if (world
																																														.getBlockMetadata(
																																																x + 0,
																																																y + 1,
																																																z + 2) == 3013) {
																																													if (world
																																															.getBlockMetadata(
																																																	x + 1,
																																																	y + 1,
																																																	z + 2) == 3013) {
																																														return true;
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

	private static boolean checkSouth(World world, int x, int y, int z) {
		if (world.getBlockMetadata(x + 2, y + -1, z + -1) == 3013) {
			if (world.getBlockMetadata(x + 2, y + -1, z + 0) == 3013) {
				if (world.getBlockMetadata(x + 2, y + -1, z + 1) == 3013) {
					if (world.getBlockMetadata(x + 2, y + 0, z + -1) == 0) {
						if (world.getBlockMetadata(x + 2, y + 0, z + 0) == 3020) {
							if (world.getBlockMetadata(x + 2, y + 0, z + 1) == 0) {
								if (world.getBlockMetadata(x + 2, y + 1, z + -1) == 3013) {
									if (world.getBlockMetadata(x + 2, y + 1, z + 0) == 3013) {
										if (world.getBlockMetadata(x + 2, y + 1,
												z + 1) == 3013) {
											if (world.getBlockMetadata(x + 1, y + -1,
													z + -1) == 3013) {
												if (world.getBlockMetadata(x + 1, y
														+ -1, z + 0) == 3013) {
													if (world.getBlockMetadata(x + 1,
															y + -1, z + 1) == 3013) {
														if (world.getBlockMetadata(
																x + 1, y + 0, z
																		+ -1) == 0) {
															if (world
																	.getBlockMetadata(
																			x + 1,
																			y + 0,
																			z + 0) == 3020) {
																if (world
																		.getBlockMetadata(
																				x + 1,
																				y + 0,
																				z + 1) == 0) {
																	if (world
																			.getBlockMetadata(
																					x + 1,
																					y + 1,
																					z
																							+ -1) == 3013) {
																		if (world
																				.getBlockMetadata(
																						x + 1,
																						y + 1,
																						z + 0) == 3013) {
																			if (world
																					.getBlockMetadata(
																							x + 1,
																							y + 1,
																							z + 1) == 3013) {
																				if (world
																						.getBlockMetadata(
																								x + 0,
																								y
																										+ -1,
																								z
																										+ -1) == 3013) {
																					if (world
																							.getBlockMetadata(
																									x + 0,
																									y
																											+ -1,
																									z + 0) == 3013) {
																						if (world
																								.getBlockMetadata(
																										x + 0,
																										y
																												+ -1,
																										z + 1) == 3013) {
																							if (world
																									.getBlockMetadata(
																											x + 0,
																											y + 0,
																											z
																													+ -1) == 0) {
																								if (world
																										.getBlockMetadata(
																												x + 0,
																												y + 0,
																												z + 1) == 0) {
																									if (world
																											.getBlockMetadata(
																													x + 0,
																													y + 1,
																													z
																															+ -1) == 3013) {
																										if (world
																												.getBlockMetadata(
																														x + 0,
																														y + 1,
																														z + 0) == 3013) {
																											if (world
																													.getBlockMetadata(
																															x + 0,
																															y + 1,
																															z + 1) == 3013) {
																												if (world
																														.getBlockMetadata(
																																x
																																		+ -1,
																																y
																																		+ -1,
																																z
																																		+ -1) == 3013) {
																													if (world
																															.getBlockMetadata(
																																	x
																																			+ -1,
																																	y
																																			+ -1,
																																	z + 0) == 3013) {
																														if (world
																																.getBlockMetadata(
																																		x
																																				+ -1,
																																		y
																																				+ -1,
																																		z + 1) == 3013) {
																															if (world
																																	.getBlockMetadata(
																																			x
																																					+ -1,
																																			y + 0,
																																			z
																																					+ -1) == 0) {
																																if (world
																																		.getBlockMetadata(
																																				x
																																						+ -1,
																																				y + 0,
																																				z + 0) == 3020) {
																																	if (world
																																			.getBlockMetadata(
																																					x
																																							+ -1,
																																					y + 0,
																																					z + 1) == 0) {
																																		if (world
																																				.getBlockMetadata(
																																						x
																																								+ -1,
																																						y + 1,
																																						z
																																								+ -1) == 3013) {
																																			if (world
																																					.getBlockMetadata(
																																							x
																																									+ -1,
																																							y + 1,
																																							z + 0) == 3013) {
																																				if (world
																																						.getBlockMetadata(
																																								x
																																										+ -1,
																																								y + 1,
																																								z + 1) == 3013) {
																																					if (world
																																							.getBlockMetadata(
																																									x
																																											+ -2,
																																									y
																																											+ -1,
																																									z
																																											+ -1) == 3013) {
																																						if (world
																																								.getBlockMetadata(
																																										x
																																												+ -2,
																																										y
																																												+ -1,
																																										z + 0) == 3013) {
																																							if (world
																																									.getBlockMetadata(
																																											x
																																													+ -2,
																																											y
																																													+ -1,
																																											z + 1) == 3013) {
																																								if (world
																																										.getBlockMetadata(
																																												x
																																														+ -2,
																																												y + 0,
																																												z
																																														+ -1) == 0) {
																																									if (world
																																											.getBlockMetadata(
																																													x
																																															+ -2,
																																													y + 0,
																																													z + 0) == 3020) {
																																										if (world
																																												.getBlockMetadata(
																																														x
																																																+ -2,
																																														y + 0,
																																														z + 1) == 0) {
																																											if (world
																																													.getBlockMetadata(
																																															x
																																																	+ -2,
																																															y + 1,
																																															z
																																																	+ -1) == 3013) {
																																												if (world
																																														.getBlockMetadata(
																																																x
																																																		+ -2,
																																																y + 1,
																																																z + 0) == 3013) {
																																													if (world
																																															.getBlockMetadata(
																																																	x
																																																			+ -2,
																																																	y + 1,
																																																	z + 1) == 3013) {
																																														return true;
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

	private static boolean checkWest(World world, int x, int y, int z) {
		if (world.getBlockMetadata(x + 1, y + -1, z + 2) == 3013) {
			if (world.getBlockMetadata(x + 0, y + -1, z + 2) == 3013) {
				if (world.getBlockMetadata(x + -1, y + -1, z + 2) == 3013) {
					if (world.getBlockMetadata(x + 1, y + 0, z + 2) == 0) {
						if (world.getBlockMetadata(x + 0, y + 0, z + 2) == 3020) {
							if (world.getBlockMetadata(x + -1, y + 0, z + 2) == 0) {
								if (world.getBlockMetadata(x + 1, y + 1, z + 2) == 3013) {
									if (world.getBlockMetadata(x + 0, y + 1, z + 2) == 3013) {
										if (world.getBlockMetadata(x + -1, y + 1,
												z + 2) == 3013) {
											if (world.getBlockMetadata(x + 1, y + -1,
													z + 1) == 3013) {
												if (world.getBlockMetadata(x + 0, y
														+ -1, z + 1) == 3013) {
													if (world.getBlockMetadata(
															x + -1, y + -1,
															z + 1) == 3013) {
														if (world.getBlockMetadata(
																x + 1, y + 0,
																z + 1) == 0) {
															if (world
																	.getBlockMetadata(
																			x + 0,
																			y + 0,
																			z + 1) == 3020) {
																if (world
																		.getBlockMetadata(
																				x
																						+ -1,
																				y + 0,
																				z + 1) == 0) {
																	if (world
																			.getBlockMetadata(
																					x + 1,
																					y + 1,
																					z + 1) == 3013) {
																		if (world
																				.getBlockMetadata(
																						x + 0,
																						y + 1,
																						z + 1) == 3013) {
																			if (world
																					.getBlockMetadata(
																							x
																									+ -1,
																							y + 1,
																							z + 1) == 3013) {
																				if (world
																						.getBlockMetadata(
																								x + 1,
																								y
																										+ -1,
																								z + 0) == 3013) {
																					if (world
																							.getBlockMetadata(
																									x + 0,
																									y
																											+ -1,
																									z + 0) == 3013) {
																						if (world
																								.getBlockMetadata(
																										x
																												+ -1,
																										y
																												+ -1,
																										z + 0) == 3013) {
																							if (world
																									.getBlockMetadata(
																											x + 1,
																											y + 0,
																											z + 0) == 0) {
																								if (world
																										.getBlockMetadata(
																												x
																														+ -1,
																												y + 0,
																												z + 0) == 0) {
																									if (world
																											.getBlockMetadata(
																													x + 1,
																													y + 1,
																													z + 0) == 3013) {
																										if (world
																												.getBlockMetadata(
																														x + 0,
																														y + 1,
																														z + 0) == 3013) {
																											if (world
																													.getBlockMetadata(
																															x
																																	+ -1,
																															y + 1,
																															z + 0) == 3013) {
																												if (world
																														.getBlockMetadata(
																																x + 1,
																																y
																																		+ -1,
																																z
																																		+ -1) == 3013) {
																													if (world
																															.getBlockMetadata(
																																	x + 0,
																																	y
																																			+ -1,
																																	z
																																			+ -1) == 3013) {
																														if (world
																																.getBlockMetadata(
																																		x
																																				+ -1,
																																		y
																																				+ -1,
																																		z
																																				+ -1) == 3013) {
																															if (world
																																	.getBlockMetadata(
																																			x + 1,
																																			y + 0,
																																			z
																																					+ -1) == 0) {
																																if (world
																																		.getBlockMetadata(
																																				x + 0,
																																				y + 0,
																																				z
																																						+ -1) == 3020) {
																																	if (world
																																			.getBlockMetadata(
																																					x
																																							+ -1,
																																					y + 0,
																																					z
																																							+ -1) == 0) {
																																		if (world
																																				.getBlockMetadata(
																																						x + 1,
																																						y + 1,
																																						z
																																								+ -1) == 3013) {
																																			if (world
																																					.getBlockMetadata(
																																							x + 0,
																																							y + 1,
																																							z
																																									+ -1) == 3013) {
																																				if (world
																																						.getBlockMetadata(
																																								x
																																										+ -1,
																																								y + 1,
																																								z
																																										+ -1) == 3013) {
																																					if (world
																																							.getBlockMetadata(
																																									x + 1,
																																									y
																																											+ -1,
																																									z
																																											+ -2) == 3013) {
																																						if (world
																																								.getBlockMetadata(
																																										x + 0,
																																										y
																																												+ -1,
																																										z
																																												+ -2) == 3013) {
																																							if (world
																																									.getBlockMetadata(
																																											x
																																													+ -1,
																																											y
																																													+ -1,
																																											z
																																													+ -2) == 3013) {
																																								if (world
																																										.getBlockMetadata(
																																												x + 1,
																																												y + 0,
																																												z
																																														+ -2) == 0) {
																																									if (world
																																											.getBlockMetadata(
																																													x + 0,
																																													y + 0,
																																													z
																																															+ -2) == 3020) {
																																										if (world
																																												.getBlockMetadata(
																																														x
																																																+ -1,
																																														y + 0,
																																														z
																																																+ -2) == 0) {
																																											if (world
																																													.getBlockMetadata(
																																															x + 1,
																																															y + 1,
																																															z
																																																	+ -2) == 3013) {
																																												if (world
																																														.getBlockMetadata(
																																																x + 0,
																																																y + 1,
																																																z
																																																		+ -2) == 3013) {
																																													if (world
																																															.getBlockMetadata(
																																																	x
																																																			+ -1,
																																																	y + 1,
																																																	z
																																																			+ -2) == 3013) {
																																														return true;
																																														
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}
	
}
